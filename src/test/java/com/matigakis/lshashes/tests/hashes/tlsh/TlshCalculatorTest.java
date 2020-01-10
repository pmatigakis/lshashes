package com.matigakis.lshashes.tests.hashes.tlsh;

import static org.junit.Assert.*;

import com.matigakis.lshashes.hashes.tlsh.Data;
import com.matigakis.lshashes.hashes.tlsh.Text;
import com.matigakis.lshashes.hashes.tlsh.Tlsh;
import com.matigakis.lshashes.hashes.tlsh.TlshCalculator;
import org.junit.Test;

public class TlshCalculatorTest {
    @Test
    public void calculate() {
        Data data = Text.create("Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Sed congue pharetra cursus. Mauris eu " +
                "semper ante, vel faucibus leo. Interdum et malesuada fames " +
                "ac ante ipsum primis in faucibus");

        TlshCalculator calculator = new TlshCalculator();
        Tlsh tlsh =  calculator.calculate(data);

        assertEquals("400522092b43249030c390362b94a6812388a1142907080f0032d02e0c28e8838480bc", tlsh.toHex());
    }
}
