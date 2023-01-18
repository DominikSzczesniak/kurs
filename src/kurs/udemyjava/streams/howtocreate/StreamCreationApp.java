package kurs.udemyjava.streams.howtocreate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationApp {

    public static void main(String[] args) {
        List<String> musicStyles = List.of("Rock", "Trance", "Rap", "Pop", "Blues", "Classical music");

        musicStyles.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(Stream.of("Rock", "Trance", "Rap", "Pop", "Blues", "Classical music")
                .filter(word -> word.length() < 5)
                .collect(Collectors.toList()));

        System.out.println("The number of elements in the array: " +
                Arrays.stream(new double[]{3.4, 5.6, 1.3, 54.3}).count());
    }
}
