package com.matigakis.lshashes.tests.hashes.tlsh;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.pearson.Pearson;
import com.matigakis.lshashes.hashes.pearson.LookupTable;
import com.matigakis.lshashes.hashes.tlsh.Mapping;
import com.matigakis.lshashes.hashes.tlsh.Triplet;
import java.util.Random;
import org.junit.Test;

public class MappingTest {

    @Test
    public void map() {
        Random random = new Random(42);
        LookupTable lookupTable = new LookupTable(random);
        Pearson pearson = new Pearson(lookupTable);
        Mapping mapping = new Mapping(pearson);
        Triplet triplet = new Triplet(1, 2, 3);

        int mappingValue = mapping.map(triplet);
        assertEquals(39, mappingValue);
    }
}
