package com.hcf.head.first.design.pattern.chapter03.ioextra;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LowerCaseOutputStream extends FilterOutputStream {
    public LowerCaseOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(Character.toLowerCase(b));
    }

    @Override
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        super.write(b, off, len);
    }
}
