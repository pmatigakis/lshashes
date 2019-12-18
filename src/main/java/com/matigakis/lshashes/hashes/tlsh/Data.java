package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;

public class Data {
    private List<Integer> data;

    public Data(List<Integer> data) {
        this.data = Collections.unmodifiableList(data);
    }

    public List<Integer> getData() {
        return data;
    }
}
