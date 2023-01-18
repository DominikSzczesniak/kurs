package kurs.udemyjava.lambda.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaUnaryApp {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5 ,6 ,7 ,8 ,9, 10);
        System.out.println(operateOnList(numbers, number -> number * 3));

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(operateOnList(letters, letter -> letter.toUpperCase()));

    }

    private static <T> List<T> operateOnList(List<T> list, UnaryOperator<T> operator) {
        List<T> newList = new ArrayList<>();
        for (T element : list) {
            newList.add(operator.apply(element));
        }
        return newList;
    }
}
