package kurs.NAUKA.exceptions;

public class ZeroDivisorException extends Exception{

    ZeroDivisorException(Exception e){
        super(e);
    }
    ZeroDivisorException(String message){
        super(message);
    }
}
