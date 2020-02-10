package com.matigakis.lshashes.hashes.tlsh;

import java.util.List;

/**
 * TLSH header creator.
 */
public class HeaderCreator {
    /**
     * Create a new HeaderCreator object.
     *
     * @param data the data to use for the header calculation
     * @param quartiles the calculated quartiles
     * @return
     */
    public Header create(List<Integer> data, Quartiles quartiles) {
        int checksum = data.stream().mapToInt(Integer::intValue).sum() % 256;
        int lengthRepr = ((int) Math.floor(Math.log(data.size()))) % 256;

        int q1 = quartiles.getQ1();
        int q2 = quartiles.getQ2();
        int q3 = quartiles.getQ3();
        int q1Ratio = (q1 * 100 / q3) % 16;
        int q2Ratio = (q2 * 100 / q3) % 16;
        int q = (q1Ratio << 4) | q2Ratio;

        return new Header(checksum, lengthRepr, q);
    }
}
