package kurs.udemyjava.exceptions;

public class ZeroDivisorException extends Exception{

    ZeroDivisorException(Exception e){
        super(e);
    }
    ZeroDivisorException(String message){
        super(message);
    }
}
