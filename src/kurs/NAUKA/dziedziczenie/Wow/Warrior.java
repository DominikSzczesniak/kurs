package kurs.NAUKA.dziedziczenie.Wow;

public class Warrior extends ClassInWow{
    public Warrior(String className, String color, int numberOfSpecializations, String armorType, int amountOfWeapons) {
        super(className, color, numberOfSpecializations);
        this.armorType = armorType;
        this.amountOfWeapons = amountOfWeapons;
    }
    String armorType;
    int amountOfWeapons;

    @Override
    public void classInfo() {
        super.classInfo();
        System.out.println("Armor type: " + armorType);
        System.out.println("Amount of weapons: " + amountOfWeapons);
    }

    @Override
    void mountUp() {
        System.out.println(getClassName() + " has mounted up");
    }

    public int getAmountOfWeapons() {
        return amountOfWeapons;
    }

    public void setAmountOfWeapons(int amountOfWeapons) {
        this.amountOfWeapons = amountOfWeapons;
    }
}
