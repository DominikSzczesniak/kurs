package kurs.udemyjava.recursion;

public class recursionApp {
    public static void main(String[] args) {
        final int LICZBA = 3;
        long start = System.nanoTime();
        System.out.println(silnia(LICZBA));
        long end = System.nanoTime();
        System.out.println("Czas: " + (end - start));

        System.out.println("----------------------------------------------------");

        System.out.println(silniaRek(LICZBA));
        System.out.println("Czas: " + (end - start));
    }

    private static long silniaRek(int x) {
        if (x <= 1) {
            return 1;
        } else {
            long wynik = x * silniaRek(--x);
            return wynik;
        }
    }

    private static long silnia(int x) {
        long wynik = 1;
        while (x > 1)
        {
            wynik *= x;
            x--;
        }
        return wynik;
    }
}
