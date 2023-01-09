package differentsources;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ZapisDoPliku {
    public static void main(String[] args) {
        File f = new File("plik.txt");
        if (!f.exists()){
            try {
                f.createNewFile();
                System.out.println("Plik zostal utworzony");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        if (f.canWrite()){
            try {
                FileWriter fileWriter = new FileWriter(f, true);
                Formatter fm = new Formatter(fileWriter);

                Scanner scannerFile = new Scanner(f);
                Scanner scanner = new Scanner(System.in);

                System.out.println("Podaj tekst do pliku");
                String text = scanner.nextLine();
                fm.format("%s \r\n", text);
                System.out.println("zapisano!");
                fm.close();
                fileWriter.close();

                System.out.println("\nZAWARTOŚĆ PLIKU:");
                while (scannerFile.hasNextLine()){
                    System.out.println(scannerFile.nextLine());
                }
                scanner.close();
                scannerFile.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
