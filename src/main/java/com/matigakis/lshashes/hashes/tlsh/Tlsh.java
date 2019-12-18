package com.matigakis.lshashes.hashes.tlsh;

public class Tlsh {
    private Header header;
    private Digest digest;

    public Tlsh(Header header, Digest digest) {
        this.header = header;
        this.digest = digest;
    }

    public Header getHeader() {
        return header;
    }

    public Digest getDigest() {
        return digest;
    }

    public String toHex() {
        StringBuilder sb = new StringBuilder();

        sb.append(header.toHex());
        sb.append(digest.toHex());

        return sb.toString();
    }
}
