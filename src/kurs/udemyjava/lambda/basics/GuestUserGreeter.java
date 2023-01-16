package kurs.udemyjava.lambda.basics;

public class GuestUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Guest user");
    }
}
