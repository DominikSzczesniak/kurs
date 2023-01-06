package kurs.udemyjava.dziedziczenie.Wow;

public class ClassInWowApp {
    public static void main(String[] args) {
        Mage mage = new Mage("Mage", "blue", 3, 12, "ranged");

        Warrior warrior = new Warrior("Warrior", "brown", 3, "Plate", 2);

        mage.classInfo();
        mage.mountUp();
        mage.castPortal();
        mage.castPortal("Orgrimmar");

        System.out.println("-----------------------------");

        System.out.println(warrior.getAmountOfWeapons());
        warrior.setAmountOfWeapons(5);
        warrior.classInfo();
        warrior.mountUp();

        System.out.println("Amount of made wow classes: " + ClassInWow.liczebnosc);
    }
}
