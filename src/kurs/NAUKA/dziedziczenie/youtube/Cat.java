package kurs.NAUKA.dziedziczenie.youtube;

public class Cat extends Animall{
    public void idz(){
        System.out.println("Ide sobie");
    }
    @Override
    public void dajGlos() {
        System.out.println("Meow Meow");
    }
}
