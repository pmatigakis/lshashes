package com.matigakis.lshashes.hashes.tlsh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A data container for text
 */
public class Text extends Data {
    private Text(List<Integer> data) {
        super(data);
    }

    /**
     * Create a new Text object
     *
     * @param text the text to use
     * @return the created Text object
     */
    public static Text create(String text) {
        ArrayList<Integer> data = new ArrayList<>();
        Iterator<Integer> iterator = text.chars().iterator();

        while (iterator.hasNext()) {
            data.add(iterator.next());
        }

        return new Text(data);
    }
}
