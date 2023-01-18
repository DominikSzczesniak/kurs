package kurs.udemyjava.streams.distinct;

import kurs.udemyjava.collections.arraylist.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctApp {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "pineapple", "watermelon", "banana", "kiwi", "apple", "kiwi");

        List<String> availableFruits = fruits.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(availableFruits);


        List<Product> cereals = List.of(
                new Product("Lucky Puffs", 8.59, "Logs"),
                new Product("Cinnamon Loops", 7.59, "ABC"),
                new Product("Cinnamon Loops", 7.59, "ABC")
        );

        List<Product> availableCereals = cereals.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(availableCereals);

    }
}
