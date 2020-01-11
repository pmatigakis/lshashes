package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;

/**
 * Container class for the data to use for the tlsh hash calculation
 */
public class Data {
    private List<Integer> data;

    /**
     * Create a new Data object
     *
     * @param data the contained data
     */
    public Data(List<Integer> data) {
        this.data = Collections.unmodifiableList(data);
    }

    /**
     * Get the contained data
     *
     * @return the contained data
     */
    public List<Integer> getData() {
        return data;
    }
}
