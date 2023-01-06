package kurs.udemyjava.dziedziczenie.youtube;

public class Dog extends Animall{
    Dog(String imie) throws ZleImieException {
        if (imie.length() == 0){
            throw new ZleImieException();
        }
        this.imie = imie;
    }
    String imie;
    public void idz(){
        System.out.println("Ide sobie");
    }
    @Override
    public void dajGlos() {
        System.out.println("Woof Woof");
    }
}
