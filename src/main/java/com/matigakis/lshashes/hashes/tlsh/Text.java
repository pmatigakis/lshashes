package com.matigakis.lshashes.hashes.tlsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Text extends Data {
    private Text(List<Integer> data) {
        super(data);
    }

    public static Text create(String text) {
        ArrayList<Integer> data = new ArrayList<>();
        Iterator<Integer> iterator = text.chars().iterator();

        while (iterator.hasNext()) {
            data.add(iterator.next());
        }

        return new Text(data);
    }
}
