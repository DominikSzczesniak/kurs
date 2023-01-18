package kurs.udemyjava.streams.map;

import kurs.udemyjava.collections.arraylist.Product;

import java.util.List;
import java.util.stream.Collectors;

public class MapApp {

    public static void main(String[] args) {
        List<String> names = List.of("aladdin", "clara", "Cesar", "polly");
        List<String> namesCapitalized = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
        System.out.println(namesCapitalized);


        List<Product> cereals = List.of(
                new Product("Captain Crunch", 9.99, "ABC"),
                new Product("Fruity Oatmeal", 6.99, "Old Oat"),
                new Product("Cinnamon Loops", 7.59, "ABC"),
                new Product("Lucky Puffs", 8.59, "Logs"),
                new Product("Barn Flakes", 5.09, "Old Oat"),
                new Product("Golden Cookies", 9.99, "ABC")
        );

        List<String> cerealNames = cereals.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(cerealNames);

        List<Product> increasedPriceProducts = cereals.stream()
                .map(product -> new Product(
                        product.getName(),
                        product.getPrice() * 1.2,
                        product.getBrand()
                ))
                .collect(Collectors.toList());
        System.out.println(increasedPriceProducts);

    }
}
