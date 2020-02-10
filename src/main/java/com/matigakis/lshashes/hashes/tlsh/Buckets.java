package com.matigakis.lshashes.hashes.tlsh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TLSH bucket container.
 */
public class Buckets {
    private int[] buckets;

    /**
     * Create a new Buckets object.
     */
    public Buckets() {
        buckets = new int[256];
    }

    /**
     * Increase the bucket value at the given index.
     *
     * @param index the bucket index
     */
    public void incr(int index) {
        buckets[index]++;
    }

    /**
     * Get the bucket value at the given index.
     *
     * @param index the bucket index
     * @return the index value
     */
    public int get(int index) {
        return buckets[index];
    }

    /**
     * Get the bucket values.
     *
     * @return the bucket values
     */
    public List<Integer> getValues() {
        return Arrays.stream(buckets).boxed().collect(Collectors.toList());
    }
}
