package kurs.NAUKA.objectsandclasses;

import java.util.Scanner;

public class ClassesInWow extends Character implements MountUp {
    public ClassesInWow(String nickname, String className, String color, String specialization, String role, int numberOfSpecializations) {
        super(nickname, className, color);
        this.specialization = specialization;
        this.role = role;
        this.numberOfSpecializations = numberOfSpecializations;
    }

    private String specialization;
    String role;
    private int numberOfSpecializations;

    public String specifySpecialization(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your specialization: ");
        String specialization = scan.nextLine();
        this.specialization = specialization;
        return specialization;
    }

    public void assignRole() {
        if (specialization.equals("Protection") || specialization.equals("Vengeance") || specialization.equals("Guardian") || specialization.equals("Blood") ||
                specialization.equals("Brewmaster"))
        role = "Tank";
        else role = "DPS";
    }

    @Override
    public void characterInfo() {
        super.characterInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Role: " + role);
        System.out.println("Number of specializations: " + numberOfSpecializations);
    }

    @Override
    public void useAnAbility() {
        System.out.println(getClassName() + " used an ability");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setNumberOfSpecializations(int numberOfSpecializations) {
        this.numberOfSpecializations = numberOfSpecializations;
    }

    @Override
    public void mounting() {
        System.out.println(getClassName() + " has summoned a mount");
    }
}


