package com.matigakis.lshashes.hashes.tlsh;

import com.matigakis.lshashes.hashes.pearson.Pearson;

import java.util.ArrayList;

/**
 * TLSH triplet mapping object.
 */
public class Mapping {
    private Pearson hash;

    /**
     * Create a new Mapping object.
     *
     * @param hash the pearson hash to use
     */
    public Mapping(Pearson hash) {
        this.hash = hash;
    }

    /**
     * Map the tripplet to a bucket index.
     *
     * @param triplet the triplet to map
     * @return the bucket value
     */
    public int map(Triplet triplet) {
        ArrayList<Integer> tripletData = new ArrayList<>();
        tripletData.add(triplet.c1);
        tripletData.add(triplet.c2);
        tripletData.add(triplet.c3);

        return hash.hash(tripletData);
    }
}
