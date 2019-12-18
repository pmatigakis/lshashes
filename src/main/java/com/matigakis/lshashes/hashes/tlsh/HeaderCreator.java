package com.matigakis.lshashes.hashes.tlsh;

import java.util.ArrayList;
import java.util.List;

public class HeaderCreator {
    public Header create(List<Integer> data, Quartiles quartiles) {
        int checksum = data.stream().mapToInt(Integer::intValue).sum() % 256;
        int lengthRepr = ((int) Math.floor(Math.log(data.size()))) % 256;

        int q1 = quartiles.getQ1();
        int q2 = quartiles.getQ2();
        int q3 = quartiles.getQ3();
        int q1_ratio = (q1 * 100 / q3) % 16;
        int q2_ratio = (q2 * 100 / q3) % 16;
        int q = (q1_ratio << 4) | q2_ratio;

        ArrayList<Integer> headerData = new ArrayList<>();
        headerData.add(checksum);
        headerData.add(lengthRepr);
        headerData.add(q);

        return new Header(checksum, lengthRepr, q);
    }
}
