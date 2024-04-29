package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathIO {
    public static void createPath() throws IOException {
        // create object of Path -> /usr/local/bin
        Path path = (Path) Paths.get("/usr", "local", "bin");

        // print Path
        System.out.println(path);
    }


    public static void getAbsolutePath(){

    }
}
