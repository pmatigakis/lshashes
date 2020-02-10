package com.matigakis.lshashes.hashes.pearson;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Pearson hash lookup table object.
 */
public class LookupTable {
    // TODO: this can be an array
    private List<Integer> table;

    /**
     * Create a new LookupTable object.
     *
     * @param random the random value generator
     */
    public LookupTable(Random random) {
        table = IntStream.range(0, 256)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(table, random);
    }

    /**
     * Create a new LookupTable object.
     *
     * @return the lookup table
     */
    public static LookupTable create() {
        return LookupTable.create(42);
    }

    /**
     * Create a new LookupTable object.
     *
     * @param seed the random seed to use
     * @return the lookup table
     */
    public static LookupTable create(long seed) {
        Random random = new Random(seed);

        return new LookupTable(random);
    }

    /**
     * Get the lookup table value at the given position.
     *
     * @param position the position for which we want the value
     * @return the lookup table value
     */
    public int get(int position) {
        if (position < 0 | position >= 256) {
            throw new IndexOutOfBoundsException();
        }

        return table.get(position);
    }
}
