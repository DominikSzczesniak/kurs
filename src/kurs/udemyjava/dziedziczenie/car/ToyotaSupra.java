package kurs.udemyjava.dziedziczenie.car;

public class ToyotaSupra extends Car{
    public ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super("Toyota Supra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota supra is started");
    }
}
