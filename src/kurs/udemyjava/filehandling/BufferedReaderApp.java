package kurs.udemyjava.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class BufferedReaderApp {
    public static void main(String[] args) {

        String HAMLET_PART_FILE_PATH = "src\\kurs\\udemyjava\\filehandling\\Hamlet.txt";

        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)){
            BufferedReader hamletBufferReader = new BufferedReader(hamletReader);

            readAllLines(hamletBufferReader);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readAllLines(BufferedReader hamletBufferReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = hamletBufferReader.readLine()) != null){
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }
}
