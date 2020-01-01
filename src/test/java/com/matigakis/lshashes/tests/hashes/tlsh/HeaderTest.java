package com.matigakis.lshashes.tests.hashes.tlsh;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.tlsh.Header;
import org.junit.Test;

public class HeaderTest {

    @Test
    public void toHex() {
        Header header = new Header(5, 6, 255);

        assertEquals("0506ff", header.toHex());
    }
}
