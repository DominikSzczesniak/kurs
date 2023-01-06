package kurs.udemyjava.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsApp {
    public static void main(String[] args) {

        Box<Integer> myFavoriteNumber = new Box<>();
        myFavoriteNumber.setTypeData(128);
        Util.displayToString(myFavoriteNumber);

        Box<String> myFavoriteActor = new Box<>();
        myFavoriteActor.setTypeData("Russel Crowe");
        Util.displayToString(myFavoriteActor);

        ArrayList<Box<String>> pileOfBoxes = new ArrayList<>();
        pileOfBoxes.add(myFavoriteActor);
        pileOfBoxes.add(myFavoriteActor);
        Util.displayToString(pileOfBoxes);

        OrderedPair<Integer, String> kobeBryant = new OrderedPair<>(24, "Kobe Bryant");
        OrderedPair<String, String> malta = new OrderedPair<>("MLT", "Malta");

        ArrayList<OrderedPair<String, String>> listOfCountries = new ArrayList<>();
        listOfCountries.add(malta);
        listOfCountries.add(malta);
        listOfCountries.add(malta);
        Util.displayToString(listOfCountries);

    }
}
