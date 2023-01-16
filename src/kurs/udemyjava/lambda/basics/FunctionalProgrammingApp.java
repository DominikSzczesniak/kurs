package kurs.udemyjava.lambda.basics;

import java.util.Scanner;

public class FunctionalProgrammingApp {
    public static void main(String[] args) {

        LoggedInUserGreeter loggedInUserGreeter = new LoggedInUserGreeter();
        WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
        Scanner userStatusScanner = new Scanner(System.in);
        String userStatus = userStatusScanner.nextLine();

        Greeter greeter;
        if ("guest".equals(userStatus)) {
            greeter = () -> System.out.println("Welcome to our application. Please create an account or log in.");
        } else if ("loggedIn".equals(userStatus)) {
            greeter = () -> System.out.println("Welcome BACK");
        } else {
            greeter = () -> System.err.println("Unknown user status.");
        }

        welcomeMessageService.greet(greeter);


        SumPrinter sumPrinter = new SumPrinter();

        sumPrinter.printSum(() -> 5 + 7);
        sumPrinter.printSum((x, y) -> x + y, 5, 7);

    }
}
