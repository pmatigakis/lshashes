package com.matigakis.lshashes.hashes.tlsh;

import java.util.ArrayList;
import java.util.List;

/**
 * Window triplet selector object.
 */
public class TripletSelector {
    private int[][] tripletIndexList = {
            {0, 1, 2},
            {0, 1, 3},
            {0, 1, 4},
            {0, 2, 3},
            {0, 2, 4},
            {0, 4, 4}
    };

    /**
     * Get the triplet that exist in the given window.
     *
     * @param window the data window
     * @return a list with the window triplets
     */
    public List<Triplet> select(Window window) {
        ArrayList<Triplet> triplets = new ArrayList<>();

        for (int[] tripletIndices: tripletIndexList) {
            triplets.add(new Triplet(window.get(tripletIndices[0]),
                    window.get(tripletIndices[1]),
                    window.get(tripletIndices[2])));
        }

        return triplets;
    }
}
