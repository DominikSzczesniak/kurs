package kurs.NAUKA.interfejs;

public class Samochod extends Pojazd implements Poruszanie, Comparable<String>{
    Samochod(String nazwa, int iloscKol) {
        super(nazwa);
        this.iloscKol = iloscKol;
    }
    int iloscKol;

    @Override
    public void jedzDoPrzodu() {
        System.out.println("Samochod jedzie do przodu");
    }

    @Override
    public void skrecaj() {
        System.out.println("Skrecam");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
