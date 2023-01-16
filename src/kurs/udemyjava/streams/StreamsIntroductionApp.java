package kurs.udemyjava.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroductionApp {

    public static void main(String[] args) {
            List<Integer> temperatures = List.of(16, 16, 16, 17, 19, 19, 16);

        System.out.println(temperatures.stream()
                    .filter(temperature -> temperature > 16)
                    .collect(Collectors.toList()));


    }
}
