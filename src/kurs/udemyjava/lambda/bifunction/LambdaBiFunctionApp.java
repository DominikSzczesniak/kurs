package kurs.udemyjava.lambda.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaBiFunctionApp {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> getPow = (numberOne, numberTwo) -> Math.pow(numberOne, numberTwo);

        System.out.println(getPow.apply(5, 4));

        BiFunction<Integer, Integer, List<Integer>> generateList = (size, multiply) -> {
            List<Integer> listOfNumbers = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                listOfNumbers.add(i * multiply);
            }
            return listOfNumbers;
        };

        System.out.println(generateList.apply(10, 3));
    }
}
