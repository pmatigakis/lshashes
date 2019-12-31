package com.matigakis.lshashes.tests.hashes.pearson;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.pearson.LookupTable;
import com.matigakis.lshashes.hashes.pearson.Pearson;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.Test;

public class PearsonTest {

    @Test
    public void hash() {
        Integer[] integers = {54, 27, 129};
        List<Integer> data = Arrays.asList(integers);
        Random random = new Random(42);
        LookupTable lookupTable = new LookupTable(random);
        Pearson pearson = new Pearson(lookupTable);

        int hash = pearson.hash(data);
        assertEquals(234, hash);
    }
}
