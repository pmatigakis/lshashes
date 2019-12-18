package com.matigakis.lshashes.hashes.tlsh;

import java.util.ArrayList;

import com.matigakis.lshashes.hashes.pearson.Pearson;

public class Mapping {
    private Pearson hash;

    public Mapping(Pearson hash) {
        this.hash = hash;
    }

    public int map(Triplet triplet) {
        ArrayList<Integer> tripletData = new ArrayList<>();
        tripletData.add(triplet.c1);
        tripletData.add(triplet.c2);
        tripletData.add(triplet.c3);

        return hash.hash(tripletData);
    }
}
