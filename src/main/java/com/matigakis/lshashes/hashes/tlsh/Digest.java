package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;


public class Digest {
    private List<Integer> digest;

    public Digest(List<Integer> digest) {
        this.digest = Collections.unmodifiableList(digest);
    }

    public List<Integer> getDigest() {
        return digest;
    }

    public String toHex() {
        StringBuilder sb = new StringBuilder();

        for (Integer value: getDigest()) {
            sb.append(String.format("%2s", Integer.toHexString(value))
                    .replace(" ", "0"));
        }

        return sb.toString();
    }
}
