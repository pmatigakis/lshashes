package com.matigakis.lshashes.tests.hashes.tlsh;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.tlsh.Buckets;
import java.util.List;
import org.junit.Test;

public class BucketsTest {

    @Test
    public void incr() {
        Buckets buckets = new Buckets();
        buckets.incr(1);
        buckets.incr(1);

        assertEquals(2, buckets.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void incrWithNegativeIndex() {
        Buckets buckets = new Buckets();
        buckets.incr(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void incrWithInvalidIndex() {
        Buckets buckets = new Buckets();
        buckets.incr(256);
    }

    @Test
    public void get() {
        Buckets buckets = new Buckets();

        assertEquals(0, buckets.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithNegativeIndex() {
        Buckets buckets = new Buckets();

        buckets.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithInvalidIndex() {
        Buckets buckets = new Buckets();

        buckets.get(256);
    }

    @Test
    public void getValues() {
        Buckets buckets = new Buckets();
        buckets.incr(2);

        List<Integer> values = buckets.getValues();
        assertEquals(256, values.size());
        assertEquals(0, values.get(0).intValue());
        assertEquals(1, values.get(2).intValue());
    }
}
