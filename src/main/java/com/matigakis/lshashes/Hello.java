package com.matigakis.lshashes;

import java.util.ArrayList;
import java.util.List;

import com.matigakis.lshashes.hashes.pearson.LookupTable;
import com.matigakis.lshashes.hashes.pearson.Pearson;
import com.matigakis.lshashes.hashes.tlsh.Window;
import com.matigakis.lshashes.hashes.tlsh.TripletSelector;
import com.matigakis.lshashes.hashes.tlsh.Mapping;
import com.matigakis.lshashes.hashes.tlsh.Buckets;
import com.matigakis.lshashes.hashes.tlsh.Quartiles;
import com.matigakis.lshashes.hashes.tlsh.QuartilesCalculator;
import com.matigakis.lshashes.hashes.tlsh.Header;
import com.matigakis.lshashes.hashes.tlsh.HeaderCreator;
import com.matigakis.lshashes.hashes.tlsh.Digest;
import com.matigakis.lshashes.hashes.tlsh.DigestCreator;
import com.matigakis.lshashes.hashes.tlsh.Tlsh;
import com.matigakis.lshashes.hashes.tlsh.TlshCalculator;
import com.matigakis.lshashes.hashes.tlsh.Text;
import com.matigakis.lshashes.streams.SlidingWindowSpliterator;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");

//        LookupTable lt = LookupTable.create();
//        Pearson hash = new Pearson(lt);

//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < 500; i++) {
//            for (int o = 65; o < 90; o++) {
//                al.add(o);
//            }
//        }

//        TripletSelector tripletSelector = new TripletSelector();
//        Mapping mapping = new Mapping(hash);
//        Buckets buckets = new Buckets();
//        SlidingWindowSpliterator.windowed(al, 5)
//                .map(windowValues -> new Window(windowValues))
//                .map(window -> tripletSelector.select(window))
//                .flatMap(tripletList -> tripletList.stream())
//                .map(triplet -> triplet)
//                .map(triplet -> mapping.map(triplet))
//                .forEach(bucket -> buckets.incr(bucket));
//
//        QuartilesCalculator quartilesCalculator = new QuartilesCalculator();
//        Quartiles quartiles = quartilesCalculator.quartiles(buckets);

//        System.out.println(quartiles.getQ1() + " " + quartiles.getQ2() + " " + quartiles.getQ3());
//        int hash = p.hash(al);
//
//        System.out.println(hash);

//        HeaderCreator headerCreator = new HeaderCreator();
//        Header header = headerCreator.create(al, quartiles);
//        System.out.println(header.getChecksum());
//        System.out.println(header.getLengthRepresentation());
//        System.out.println(header.getQ());
//
//        DigestCreator digestCreator = new DigestCreator();
//        Digest digest = digestCreator.create(buckets, quartiles);
//        System.out.println(digest.getDigest());

//        Data data = new Data(al);
        Text text = Text.create("hello dfsdafgasd asdgfasd askdjhlo askjdlask aldqal alkjsdaklo asjkgdiqud lakjdyhqiohoka aklsdiaqdi");
        TlshCalculator tlshCalaulator = new TlshCalculator();
        Tlsh tlsh = tlshCalaulator.calculate(text);
        System.out.println(tlsh.toHex());

        Text text2 = Text.create("hello dfsdafgasd asdgfasd askdjhlo askjdlask aldqal alkjsdaklo asjkgdiqud lakjdyhqiohoka aklsdiaqdc");
        Tlsh tlsh2 = tlshCalaulator.calculate(text2);

        System.out.println(tlsh2.toHex());
    }
}
