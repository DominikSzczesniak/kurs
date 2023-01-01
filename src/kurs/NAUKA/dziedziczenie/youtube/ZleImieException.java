package kurs.NAUKA.dziedziczenie.youtube;

public class ZleImieException extends Exception{
    @Override
    public String getMessage() {
        return "Podano błędne imię";
    }
}
