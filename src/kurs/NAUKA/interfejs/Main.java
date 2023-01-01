package kurs.NAUKA.interfejs;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("BMW", 4);
        samochod.jedzDoPrzodu();
        System.out.println(samochod.nazwa);
    }
}
