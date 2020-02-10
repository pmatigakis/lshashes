package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;

/**
 * Quartile values calculator object.
 */
public class QuartilesCalculator {
    private int calculateQuantile(int pc, Buckets buckets) {
        List<Integer> values = buckets.getValues();
        Collections.sort(values);

        double perItem = (double) values.size() / 100.0;
        int pos = (int)(perItem * (100 - pc));

        return values.get(pos);
    }

    /**
     * Calculate the quartiles of the given bucket.
     *
     * @param buckets the bucket for which to calculate the quartiles.
     * @return the quartiles
     */
    public Quartiles quartiles(Buckets buckets) {
        return new Quartiles(
                calculateQuantile(75, buckets),
                calculateQuantile(50, buckets),
                calculateQuantile(25, buckets)
        );
    }
}
