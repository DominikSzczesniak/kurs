package kurs.udemyjava.objectsandclasses;

public class ClassesInWowMain {
    public static void main(String[] args) {
        ClassesInWow mage = new ClassesInWow("Simas", "Mage", "Light blue", "Arcane" ,"DPS", 3);
        ClassesInWow warrior = new ClassesInWow("Nolan", "Warrior", "Brown", "Arms", "DPS", 3);
        // Scanner scan = new Scanner(System.in);

       // mage.specialization = scan.nextLine();
       // mage.assignRole();
        mage.setSpecialization("Fire");
        mage.characterInfo();
        mage.useAnAbility();

        System.out.println();

        //warrior.specialization = scan.nextLine();
        warrior.setSpecialization("Protection");
        warrior.assignRole();
        warrior.setNumberOfSpecializations(2);
        warrior.characterInfo();
        warrior.mounting();

    }
}
