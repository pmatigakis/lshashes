package com.matigakis.lshashes.hashes.pearson;

import java.util.List;

public class Pearson {
    private LookupTable lookupTable;

    public Pearson(LookupTable lookupTable) {
        this.lookupTable = lookupTable;
    }

    public int hash(List<Integer> data) {
        int h = 0;

        for (int item: data) {
            h = lookupTable.get(h ^ item);
        }

        return h;
    }
}
