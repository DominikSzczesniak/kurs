package kurs.udemyjava.inputoutput;

import java.util.Scanner;

import static java.util.Arrays.asList;

public class CharacterApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to World of Warlords");
        System.out.println("Here you can create your character.");
//
//        System.out.print("Name: ");
//        String name = getRace(userInput); // TODO: not getrace
//        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();


//        System.out.println("Race (human or orc): ");
//        while (!userInput.hasNext("human") && !userInput.hasNext("orc")){
//            System.err.println("wrong input");
//            getRace(userInput);
//        }
        String race = getRace(userInput);
        System.out.println("chosen race = " + race);

//        System.out.println("Difficulty (0 - easy, 1 - medium, 2 - hard): ");
//        while (!userInput.hasNextInt(3)){
//            System.err.println("wrong input, you need to type 0, 1 or 2");
//            userInput.nextLine();
//        }
//        int difficulty = userInput.nextInt();
//
//        System.out.println("Nightmare mode is on (true or false): ");
//        while (!userInput.hasNextBoolean()){
//            System.err.println("wrong input, you need to type true or false");
//            userInput.nextLine();
//        }
//        boolean isNightmareModeOn = userInput.nextBoolean();
//
//        System.out.println("-----------------------------------------------------");
//        System.out.println("Your character is created: ");
//        System.out.printf("Name: %s ", name);
//        System.out.printf("\nRace: %s ", race);
//        System.out.printf("\nDifficulty: %d ", difficulty);
//        System.out.printf("\nNightmare mode is on: %b", isNightmareModeOn);

    }

    private static String getRace(Scanner userInput) {
        System.out.println("Race (human or orc): ");
        String raceInput = userInput.nextLine();
        if (asList("human", "orc").contains(raceInput)) {
            return raceInput;
        }
        System.err.println("wrong input");
        return getRace(userInput);
    }
}
