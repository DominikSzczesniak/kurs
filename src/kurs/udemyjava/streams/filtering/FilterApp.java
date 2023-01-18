package kurs.udemyjava.streams.filtering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterApp {
    public static void main(String[] args) {
        List<Product> cereals = List.of(
                new Product("Captain Crunch", "ABC", 9.99, 4.7),
                new Product("Fruity Oatmeal", "Old Oat", 6.99, 4.2),
                new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
                new Product("Lucky Puffs", "Logs", 8.59, 4.6),
                new Product("Barn Flakes", "Old Oat", 5.09, 4.0),
                new Product("Golden Cookies", "ABC", 9.99, 4.8)
        );

        List<Product> cheapCereals = new ArrayList<>();
        cereals.stream()
                .filter(cereal -> cereal.getPrice() < 8)
                .forEach(cheapCereals::add);
        System.out.println(cheapCereals);

        Map<Integer, Product> smartWatches = new HashMap<>();
        smartWatches.put(1, new Product("Fitness Tracker", "Oxygen", 199.9, 4.7));
        smartWatches.put(2, new Product("Berry Watch", "HVR", 159.9, 4.6));
        smartWatches.put(3, new Product("A1 Model", "MorePro", 139.9, 4.3));
        smartWatches.put(4, new Product("A2 Model", "MorePro", 149.9, 4.4));

        smartWatches.entrySet().stream()
                .filter(product -> product.getValue() != null && product.getValue().getBrand().equals("MorePro"))
                .forEach(product -> System.out.println(product.getValue().getName() + " - " + product.getValue().getBrand() +
                        " - $" + product.getValue().getPrice()));

    }
}
