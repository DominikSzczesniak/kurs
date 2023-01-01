package kurs.NAUKA.dziedziczenie.youtube;

public class Samochod extends Pojazd{
    Samochod(String brand, int numberOfWheels, int numberOfDoors){
        super(brand, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Konstruktor klasy - Samochod");
    }
    int numberOfDoors;
    boolean open = false;
    void closeOpen(){
        open = !open;
        if (open)
            System.out.println("Opened");
        else System.out.println("Closed");
    }
}
