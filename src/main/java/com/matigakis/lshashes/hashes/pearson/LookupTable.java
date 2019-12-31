package com.matigakis.lshashes.hashes.pearson;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LookupTable {
    // TODO: this can be an array
    private List<Integer> table;

    public LookupTable(Random random) {
        table = IntStream.range(0, 256)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(table, random);
    }

    public static LookupTable create() {
        return LookupTable.create(42);
    }

    public static LookupTable create(long seed) {
        Random random = new Random(seed);

        return new LookupTable(random);
    }

    public int get(int position) {
        if (position < 0 | position >= 256) {
            throw new IndexOutOfBoundsException();
        }

        return table.get(position);
    }
}
