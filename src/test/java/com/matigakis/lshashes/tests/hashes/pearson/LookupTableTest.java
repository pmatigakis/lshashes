package com.matigakis.lshashes.tests.hashes.pearson;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.pearson.LookupTable;
import java.util.Random;
import org.junit.Test;

public class LookupTableTest {

    @Test
    public void create() {
        LookupTable lookupTable = LookupTable.create();

        assertNotNull(lookupTable);
        assertEquals(132, lookupTable.get(0));
    }

    @Test
    public void createUsingSeed() {
        LookupTable lookupTable = LookupTable.create(123);

        assertNotNull(lookupTable);
        assertEquals(204, lookupTable.get(0));
    }

    @Test
    public void get() {
        Random random = new Random(55);
        LookupTable lookupTable = new LookupTable(random);

        assertEquals(185, lookupTable.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithNegativePositionValue() {
        Random random = new Random(55);
        LookupTable lookupTable = new LookupTable(random);

        lookupTable.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithInvalidPositionValue() {
        Random random = new Random(55);
        LookupTable lookupTable = new LookupTable(random);

        lookupTable.get(256);
    }
}
