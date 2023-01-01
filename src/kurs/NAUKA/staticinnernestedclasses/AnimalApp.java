package kurs.NAUKA.staticinnernestedclasses;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Animal(){
            @Override
            void makeVoice() {
                System.out.println("Meow meow");
            }
        };

        cat.makeVoice();

        Animal cat2 = new Animal();
        cat2.makeVoice();
        System.out.println("----------------------------------");
        Animal.Pet pet = cat.new Pet();
    }
}
