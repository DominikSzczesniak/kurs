package kurs.udemyjava.dziedziczenie.Wow;

public class Mage extends ClassInWow implements CastPortal{
    public Mage(String className, String color, int numberOfSpecializations, int numberOfFrostSpells, String distance) {
        super(className, color, numberOfSpecializations);
        this.numberOfFrostSpells = numberOfFrostSpells;
        this.distance = distance;
    }
    int numberOfFrostSpells;
    String distance;

    @Override
    public void classInfo() {
        super.classInfo();
        System.out.println("Frost spells: " + numberOfFrostSpells);
        System.out.println("Distance: " + distance);
    }

    @Override
    void mountUp() {
        System.out.println(getClassName() + " has mounted up");
    }


    @Override
    public void castPortal() {
        System.out.println("A portal has been created");
    }

    @Override
    public void castPortal(String portal) {
        System.out.println("A portal to " + portal + " has been created");
    }
}
