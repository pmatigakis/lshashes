package com.matigakis.lshashes.hashes.tlsh;

/**
 * TLSH hash object.
 */
public class Tlsh {
    private Header header;
    private Digest digest;

    /**
     * Create an new Tlsh object.
     *
     * @param header the hash header
     * @param digest the hash digest
     */
    public Tlsh(Header header, Digest digest) {
        this.header = header;
        this.digest = digest;
    }

    /**
     * Get the hash header.
     *
     * @return the hash header
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Get the hash digest.
     *
     * @return the hash digest
     */
    public Digest getDigest() {
        return digest;
    }

    /**
     * Convert the hash to hex.
     *
     * @return the hash hex value
     */
    public String toHex() {
        StringBuilder sb = new StringBuilder();

        sb.append(header.toHex());
        sb.append(digest.toHex());

        return sb.toString();
    }
}
