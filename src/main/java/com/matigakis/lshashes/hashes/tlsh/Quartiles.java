package com.matigakis.lshashes.hashes.tlsh;

public class Quartiles {
    private int q1;
    private int q2;
    private int q3;

    public Quartiles(int q1, int q2, int q3) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public int getQ1() {
        return q1;
    }

    public int getQ2() {
        return q2;
    }

    public int getQ3() {
        return q3;
    }
}
