package kurs.udemyjava.lambda.biconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class LambdaConsumerApp {

    public static void main(String[] args) {
        BiConsumer<String, Integer> printAttribute = (text, number) -> System.out.println(text + ":" + " " + number * 3);
        printAttribute.accept("Points", 5);

        BiConsumer<List<Integer>, Integer> multiplyNumbers = (list, number) -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * number);
            }
        };

        List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
        multiplyNumbers.accept(numbers, 5);
        System.out.println(numbers);

    }
}
