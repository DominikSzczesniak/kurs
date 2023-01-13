package kurs.udemyjava.hangman;

import java.io.FileNotFoundException;

public class HangmanApp {
    public static void main(String[] args) throws FileNotFoundException {

        HangmanGame game = new HangmanGame();
        game.start();
    }
}
