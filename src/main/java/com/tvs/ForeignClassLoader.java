package com.tvs;

import java.io.IOException;
import java.io.InputStream;

public class ForeignClassLoader {

    public int load() {
        try (InputStream resourceAsStream = com.tvs.foreign.ForeignClassLoader.class.getClassLoader().getResourceAsStream("com/tvs/file2.txt")) {
            return resourceAsStream.available();
        } catch (IOException e) {
            return 0;
        }
    }
}
