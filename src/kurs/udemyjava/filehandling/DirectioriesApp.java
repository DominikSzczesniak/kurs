package kurs.udemyjava.filehandling;

import java.io.File;
import java.util.Arrays;

public class DirectioriesApp {
    public static void main(String[] args) {
        File businessBooksDirectory = new File("Ebooks\\Business");

        if (businessBooksDirectory.mkdirs()){ //makedirectories
            System.out.println("The new directory is created");
        } else {
            System.out.println("Can't create the directory.");
        }

        businessBooksDirectory.deleteOnExit();

        File fileHandlingDirectory = new File("src\\kurs\\udemyjava\\filehandling\\");
        System.out.println("Files in the filehandling directory:");
        System.out.println(Arrays.toString(fileHandlingDirectory.list()));
        System.out.println(Arrays.toString(fileHandlingDirectory.listFiles()));

    }
}
