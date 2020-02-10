package com.matigakis.lshashes.hashes.tlsh;

import java.util.Collections;
import java.util.List;

/**
 * TLSH digest object.
 */
public class Digest {
    private List<Integer> digest;

    /**
     * Create a new Digest object.
     *
     * @param digest the digest data
     */
    public Digest(List<Integer> digest) {
        this.digest = Collections.unmodifiableList(digest);
    }

    /**
     * Get the digest data.
     *
     * @return the digest data
     */
    public List<Integer> getDigest() {
        return digest;
    }

    /**
     * Get the digest hex value.
     *
     * @return the digest hex value
     */
    public String toHex() {
        StringBuilder sb = new StringBuilder();

        for (Integer value: getDigest()) {
            sb.append(String.format("%2s", Integer.toHexString(value))
                    .replace(" ", "0"));
        }

        return sb.toString();
    }
}
