package com.matigakis.lshashes.hashes.tlsh;

import java.util.List;

/**
 * Data window object.
 */
public class Window {
    private List<Integer> data;

    /**
     * Create a new Window object.
     *
     * @param data the window data
     */
    public Window(List<Integer> data) {
        this.data = data;
    }

    /**
     * Get the window data at the given index.
     *
     * @param index the window index
     * @return the data at the given index
     */
    public Integer get(int index) {
        return data.get(index);
    }
}
