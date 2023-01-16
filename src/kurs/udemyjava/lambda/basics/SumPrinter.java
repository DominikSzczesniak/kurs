package kurs.udemyjava.lambda.basics;

import java.util.function.Supplier;

public class SumPrinter {

    void printSum(Supplier<Integer> supplier){
        System.out.println(supplier.get());
    }

    public void printSum(Sum sum, int x, int y){
        System.out.println(sum.addition(x, y));
    }

}