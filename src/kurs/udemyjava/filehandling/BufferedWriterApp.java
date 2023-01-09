package kurs.udemyjava.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {
    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "src\\kurs\\udemyjava\\filehandling\\JuliusCesar.txt";
        try (BufferedWriter bufferedBookWriter = new BufferedWriter(new FileWriter(JULIUS_CESAR_FILE_PATH, true))) {
            bufferedBookWriter.write("Even you, Brutus?");
            bufferedBookWriter.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
