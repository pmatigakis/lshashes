package com.matigakis.lshashes.hashes.tlsh;

public class Header {
    private int checksum;
    private  int lengthRepresentation;
    private int q;

    public Header(int checksum, int lengthRepresentation, int q) {
        this.checksum = checksum;
        this.lengthRepresentation = lengthRepresentation;
        this.q = q;
    }

    public int getChecksum() {
        return checksum;
    }

    public int getLengthRepresentation() {
        return lengthRepresentation;
    }

    public int getQ() {
        return q;
    }

    public String toHex() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%2s", Integer.toHexString(getChecksum())).replace(" ", "0"));
        sb.append(String.format("%2s", Integer.toHexString(getLengthRepresentation())).replace(" ", "0"));
        sb.append(String.format("%2s", Integer.toHexString(getQ())).replace(" ", "0"));

        return sb.toString();
    }
}
