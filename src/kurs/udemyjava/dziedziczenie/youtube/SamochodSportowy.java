package kurs.udemyjava.dziedziczenie.youtube;

public class SamochodSportowy extends Samochod{
    SamochodSportowy(String brand, int numberOfWheels, int numberOfDoors){
        super(brand, numberOfWheels, numberOfDoors);
        System.out.println("Konstruktor klasy - SamochodSportowy");
    }
}
