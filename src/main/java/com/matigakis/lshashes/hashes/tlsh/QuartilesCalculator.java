package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;

public class QuartilesCalculator {
    private int calculateQuantile(int pc, Buckets buckets) {
        List<Integer> values = buckets.getValues();
        Collections.sort(values);

        double per_item = (double) values.size() / 100.0;
        int pos = (int)(per_item * (100 - pc));

        return values.get(pos);
    }

    public Quartiles quartiles(Buckets buckets) {
        return new Quartiles(
                calculateQuantile(75, buckets),
                calculateQuantile(50, buckets),
                calculateQuantile(25, buckets)
        );
    }
}
