package com.matigakis.lshashes.hashes.tlsh;

import com.matigakis.lshashes.exceptions.InvalidData;
import com.matigakis.lshashes.hashes.pearson.LookupTable;
import com.matigakis.lshashes.hashes.pearson.Pearson;
import com.matigakis.lshashes.streams.SlidingWindowSpliterator;

import java.util.List;

public class TlshCalculator {
    public Tlsh calculate(Data data) {
        LookupTable lt = LookupTable.create();
        Pearson hash = new Pearson(lt);
        List<Integer> dataContent = data.getData();

        TripletSelector tripletSelector = new TripletSelector();
        Mapping mapping = new Mapping(hash);
        Buckets buckets = new Buckets();
        SlidingWindowSpliterator.windowed(dataContent, 5)
                .map(windowValues -> new Window(windowValues))
                .map(window -> tripletSelector.select(window))
                .flatMap(tripletList -> tripletList.stream())
                .map(triplet -> mapping.map(triplet))
                .forEach(bucket -> buckets.incr(bucket));

        QuartilesCalculator quartilesCalculator = new QuartilesCalculator();
        Quartiles quartiles = quartilesCalculator.quartiles(buckets);

        if (quartiles.getQ3() == 0) {
            throw new InvalidData("The hash of the input data " +
                    "can't be calculated because it is either too short or " +
                    "not complex enough");
        }

        HeaderCreator headerCreator = new HeaderCreator();
        Header header = headerCreator.create(dataContent, quartiles);

        DigestCreator digestCreator = new DigestCreator();
        Digest digest = digestCreator.create(buckets, quartiles);

        return new Tlsh(header, digest);
    }
}
