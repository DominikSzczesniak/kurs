package kurs.udemyjava.lambda;

public class LoggedInUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome back");
    }
}