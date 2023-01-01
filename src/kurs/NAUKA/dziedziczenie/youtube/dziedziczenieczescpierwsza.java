package kurs.NAUKA.dziedziczenie.youtube;

public class dziedziczenieczescpierwsza {
    public static void main(String[] args) {
        System.out.println("Audi:");
        Samochod audi = new Samochod("Audi", 4, 2);
        audi.numberOfWheels = 4;
        audi.brand = "Audi";

        System.out.println("Subaru:");
        SamochodSportowy subaru = new SamochodSportowy("Subaru", 4, 4);

    }
}
