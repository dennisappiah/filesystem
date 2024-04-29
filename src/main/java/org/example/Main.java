package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        readAndWriteFiles();

        try {
            FilePathIO.createPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readAndWriteFiles() {
        String [] data = {"Hello", "Hi", "Does"};

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (var item: data)
                writer.write("\n" + item);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;


        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}