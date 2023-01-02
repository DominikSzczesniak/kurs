package kurs.NAUKA.OBJECTSUPERCLASS.objecttostring;

import java.util.Objects;

public class Pizza implements Cloneable {
    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    private double calculatePrice() {
        switch (pizzaSize) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(pizza.price, price) && Objects.equals(name, pizza.name) && pizzaSize == pizza.pizzaSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pizzaSize, price);
//        int result = 7;
//
//        result = 31 * result + (name == null ? 0 : name.hashCode());
//        result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
//        result = 31 * result + Double.valueOf(price).hashCode();
//
//        return result;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pizzaSize=" + pizzaSize +
                ", price=" + price +
                '}';
    }
}
