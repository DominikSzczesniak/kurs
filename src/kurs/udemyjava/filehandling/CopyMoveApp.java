package kurs.udemyjava.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyMoveApp {
    public static void main(String[] args) {
        Path originalPath = Paths.get("src/kurs/udemyjava/filehandling/JuliusCesar.txt");
        Path destinationPath = Paths.get("src/kurs/udemyjava/exceptions/JuliusCesar.txt");

        try {
            Files.copy(originalPath, destinationPath, StandardCopyOption.REPLACE_EXISTING);  // zamiast copy, move sprawdzac files.exists
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
