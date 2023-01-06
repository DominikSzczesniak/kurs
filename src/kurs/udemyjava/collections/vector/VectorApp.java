package kurs.udemyjava.collections.vector;

import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2, 3);
        toDoVector.add("Cleaning the garden");
        toDoVector.add("Painting the walls");
        toDoVector.add("Taking the dog for a walk");

        System.out.println("The first element of the vector is: " + toDoVector.firstElement());
        System.out.println("The last element of the vector is: " + toDoVector.lastElement());

    }
}
