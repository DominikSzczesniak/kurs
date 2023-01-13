package kurs.udemyjava.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {

    public static final String SRC_KURS_UDEMYJAVA_HANGMAN_WORDS_TXT = "src/kurs/udemyjava/hangman/words.txt";

    public void start() throws FileNotFoundException {
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        char[] guessingArray = new char[randomWord.length()];
        Arrays.fill(guessingArray, '_');
    }

    private List<String> getWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();

        File wordsFile = new File(SRC_KURS_UDEMYJAVA_HANGMAN_WORDS_TXT);
        Scanner scanner = new Scanner(wordsFile);
        while (scanner.hasNextLine()){
            words.add(scanner.nextLine());
        }
        return words;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> word = getWords();
        Random random = new Random();
        int randomNumber = random.nextInt(word.size());
        return word.get(randomNumber);
    }

}
