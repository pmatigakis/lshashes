package com.matigakis.lshashes.hashes.tlsh;

/**
 * Quartile container object.
 */
public class Quartiles {
    private int q1;
    private int q2;
    private int q3;

    /**
     * Create a new Quartiles object.
     *
     * @param q1 the first quartile value
     * @param q2 the second quartile value
     * @param q3 the third quartile value
     */
    public Quartiles(int q1, int q2, int q3) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    /**
     * Get the first quartile value.
     *
     * @return the first quartile value
     */
    public int getQ1() {
        return q1;
    }

    /**
     * Get the second quartile value.
     *
     * @return the second quartile value
     */
    public int getQ2() {
        return q2;
    }

    /**
     * Get the third quartile value.
     *
     * @return the third quartile value
     */
    public int getQ3() {
        return q3;
    }
}
