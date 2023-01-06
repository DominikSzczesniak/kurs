package kurs.udemyjava.OBJECTSUPERCLASS.objectgetclass;

import java.util.Arrays;

public class PizzaApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("All available sizes: " + PizzaSize.MEDIUM.name() + " " + PizzaSize.LARGE.name() + " " + PizzaSize.SMALL.name());
        System.out.println("-------------------------------------------------------");
        System.out.println("Available sizes:");
        for (PizzaSize pizzaSize : PizzaSize.values()){
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println("-------------------------------------------------------");
        Pizza pizzaOrder = new Pizza("Margharita", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: " + pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered another pizza:");
        System.out.println("Name: " + samePizza.getName());
        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: " + samePizza.getPrice());

        Pizza anotherPizza = new Pizza("Margharita", PizzaSize.LARGE);
        System.out.println(pizzaOrder.equals(samePizza));

        System.out.println("--------------------------------------------------");
        System.out.println(anotherPizza.getClass().getSimpleName());
        System.out.println(anotherPizza.getClass().getName());
        System.out.println(Arrays.toString(anotherPizza.getClass().getFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getMethods()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredMethods()));
        System.out.println(anotherPizza.getClass().getSuperclass());
    }
}
