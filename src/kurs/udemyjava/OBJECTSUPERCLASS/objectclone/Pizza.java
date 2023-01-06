package kurs.udemyjava.OBJECTSUPERCLASS.objectclone;

public class Pizza implements Cloneable{
    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    private double calculatePrice() {
        switch (pizzaSize){
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
