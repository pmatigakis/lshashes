package com.matigakis.lshashes.tests.hashes.tlsh;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.tlsh.Digest;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class DigestTest {

    @Test
    public void toHex() {
        Integer[] digestValues = {1, 2, 255};
        List<Integer> digestData = Arrays.asList(digestValues);
        Digest digest = new Digest(digestData);

        assertEquals("0102ff", digest.toHex());
    }
}
