package com.matigakis.lshashes.hashes.tlsh;

import java.util.List;

public class Window {
    private List<Integer> data;

    public Window(List<Integer> data) {
        this.data = data;
    }

    public Integer get(int index) {
        return data.get(index);
    }
}
