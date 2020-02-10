package com.matigakis.lshashes.hashes.tlsh;

/**
 * TLSH Header object.
 */
public class Header {
    private int checksum;
    private  int lengthRepresentation;
    private int q;

    /**
     * Create a Header object.
     *
     * @param checksum the header checksum
     * @param lengthRepresentation the header length
     * @param q the header q value
     */
    public Header(int checksum, int lengthRepresentation, int q) {
        this.checksum = checksum;
        this.lengthRepresentation = lengthRepresentation;
        this.q = q;
    }

    /**
     * Get the checksum value.
     *
     * @return the checksum value
     */
    public int getChecksum() {
        return checksum;
    }

    /**
     * Get the header length.
     *
     * @return the header length
     */
    public int getLengthRepresentation() {
        return lengthRepresentation;
    }

    /**
     * Get the q value.
     *
     * @return the q value
     */
    public int getQ() {
        return q;
    }

    /**
     * Convert the header to hex.
     *
     * @return the hex value of the header
     */
    public String toHex() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%2s", Integer.toHexString(getChecksum())).replace(" ", "0"));
        sb.append(String.format("%2s", Integer.toHexString(getLengthRepresentation())).replace(" ", "0"));
        sb.append(String.format("%2s", Integer.toHexString(getQ())).replace(" ", "0"));

        return sb.toString();
    }
}
