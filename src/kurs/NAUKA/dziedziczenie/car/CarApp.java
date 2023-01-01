package kurs.NAUKA.dziedziczenie.car;

public class CarApp {
    public static void main(String[] args) {
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("Orange", (byte)1, (short)392, (short)492,
                (short)6777, 30000, 10000, false);
        System.out.println(orangeDodgeChallenger.getCarName() + "'s price is $" + orangeDodgeChallenger.getPrice());
        orangeDodgeChallenger.setPrice(35000);
        System.out.println(orangeDodgeChallenger.getCarName() + "'s new price is $" + orangeDodgeChallenger.getPrice());
        System.out.println("The car is in city mode.");
        orangeDodgeChallenger.startTheElectricEngine();
        System.out.println("The car has " + orangeDodgeChallenger.getMileage() + " miles");
        orangeDodgeChallenger.drive(140.6);
        System.out.println("After driving, the car has " + orangeDodgeChallenger.getMileage() + " miles");

        System.out.println("---------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)450, (short)717,
                (short)40000, 15000, 10000, false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(32000);
        System.out.println(blackToyotaSupra.getCarName() + "'s new price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.startEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage() + " miles");
        blackToyotaSupra.drive(200);
        System.out.println("After driving, the car has " + blackToyotaSupra.getMileage() + " miles");

    }
}
