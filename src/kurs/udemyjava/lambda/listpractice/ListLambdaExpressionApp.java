package kurs.udemyjava.lambda.listpractice;

import java.util.List;

public class ListLambdaExpressionApp {

    public static void main(String[] args) {

        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5);

        NumberOperationService numberOperationService = new NumberOperationService();
        List<Integer> outputNumbers = numberOperationService.executeOperation(inputNumbers, (number) -> number * 2);
        System.out.println(outputNumbers);
    }
}
