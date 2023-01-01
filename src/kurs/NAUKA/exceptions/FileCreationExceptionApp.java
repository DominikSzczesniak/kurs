package kurs.NAUKA.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationExceptionApp {
    public static void main(String[] args) {
        createFile("outputFile.txt");
    }
    private static void createFile(String fileName){
        //PrintWriter outputFile = null;
        try(PrintWriter outputFile = new PrintWriter(new FileWriter(fileName))) {
            outputFile.println("Hello");
        } catch (IOException e) {
            System.err.println("Caught an IOException: " + e.getMessage());
        }
        System.out.println("This line comes after we tried to create a file");
    }
}
