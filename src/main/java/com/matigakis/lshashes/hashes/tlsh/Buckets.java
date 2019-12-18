package com.matigakis.lshashes.hashes.tlsh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Buckets {
    private int[] buckets;

    public Buckets() {
        buckets = new int[256];
    }

    public void incr(int index) {
        buckets[index]++;
    }

    public int get(int index) {
        return buckets[index];
    }

    public List<Integer> getValues() {
        return Arrays.stream(buckets).boxed().collect(Collectors.toList());
    }
}
