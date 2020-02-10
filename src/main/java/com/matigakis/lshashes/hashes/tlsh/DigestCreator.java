package com.matigakis.lshashes.hashes.tlsh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TLSH digest creator.
 */
public class DigestCreator {

    /**
     * Create a new DigestCreator object.
     *
     * @param buckets the buckets to use
     * @param quartiles the digest quartiles
     * @return the digest
     */
    public Digest create(Buckets buckets, Quartiles quartiles) {
        int[] digest = new int[32];

        for (int i = 0; i < 32; i++) {
            for (int o = 0; o < 4; o++) {
                int p = (i * 4) + o;
                int slide = (3 - o) * 2;
                int val = buckets.get(p);

                if (val <= quartiles.getQ1()) {
                    digest[i] = digest[i] | (0 << slide);
                } else if (val <= quartiles.getQ2()) {
                    digest[i] = digest[i] | (1 << slide);
                } else if (val <= quartiles.getQ3()) {
                    digest[i] = digest[i] | (2 << slide);
                } else {
                    digest[i] = digest[i] | (3 << slide);
                }
            }
        }

        List<Integer> digestData = Arrays.stream(digest)
                .boxed()
                .collect(Collectors.toList());

        return new Digest(digestData);
    }
}
