package com.tvs;

import java.io.IOException;
import java.io.InputStream;

public class Loader {

    public int load() {
        try (InputStream resourceAsStream = Loader.class.getClassLoader().getResourceAsStream("com/tvs/file1.txt")) {
            return resourceAsStream.available();
        } catch (IOException e) {
            return 0;
        }
    }
}
