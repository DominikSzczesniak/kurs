package kurs.NAUKA.dziedziczenie.youtube;

public class Pojazd {
    public Pojazd(String brand, int numberOfWheels) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        System.out.println("Konstruktor klasy Pojazd");
    }

    String brand;
    int numberOfWheels;

    protected void odpal(){
        System.out.println("Pojazd odpalił.");
    }
}
