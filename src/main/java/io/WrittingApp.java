package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WrittingApp {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("input.txt");

        Writer writer = new FileWriter(path.toFile());
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Nowy text");
        bufferedWriter.newLine();
        bufferedWriter.write("Kolejny tekst");
        bufferedWriter.close();
    }
}
