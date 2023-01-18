package kurs.udemyjava.streams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingByApp {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 9.99),
                new Item("blueberry", 20, 29.99),
                new Item("pear", 10, 29.99),
                new Item("apple", 10, 9.99),
                new Item("kiwi", 10, 19.99),
                new Item("pear", 10, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 19.99),
                new Item("apple", 10, 9.99)
        );

        Map<Boolean, List<Item>> partitionFruitBoxes = fruitBoxes.stream()
                .collect(Collectors.partitioningBy(fruitBox -> fruitBox.getPrice() > 10));
        System.out.println(partitionFruitBoxes);

        Map<String, List<Item>> fruitBoxesGroups = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName));
        System.out.println("Fruits boxes grouped by type: ");
        System.out.println(fruitBoxesGroups);

        Map<String, Long> fruitBoxesCount = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println("Fruits boxes counted by type: ");
        System.out.println(fruitBoxesCount);

    }
}
