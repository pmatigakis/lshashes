package com.matigakis.lshashes.hashes.pearson;

import java.util.List;

/**
 * Pearson hash generator.
 */
public class Pearson {
    private LookupTable lookupTable;

    /**
     * Create a new Pearson object.
     *
     * @param lookupTable the lookup table to use
     */
    public Pearson(LookupTable lookupTable) {
        this.lookupTable = lookupTable;
    }

    /**
     * Calculate the pearson hash for the given data.
     *
     * @param data the data to hash
     * @return the calculated hash
     */
    public int hash(List<Integer> data) {
        int h = 0;

        for (int item: data) {
            h = lookupTable.get(h ^ item);
        }

        return h;
    }
}
