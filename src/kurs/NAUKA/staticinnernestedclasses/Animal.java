package kurs.NAUKA.staticinnernestedclasses;

public class Animal {
    void makeVoice(){
        System.out.println("Grrrrr");
    }
    class Pet{
        String name;
        void getName(){
            //makeVoice();
            System.out.println(name);
        }
    }
}
