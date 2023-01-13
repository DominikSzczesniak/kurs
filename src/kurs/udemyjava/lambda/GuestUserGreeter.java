package kurs.udemyjava.lambda;

public class GuestUserGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Guest user");
    }
}
