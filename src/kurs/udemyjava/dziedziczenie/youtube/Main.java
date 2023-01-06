package kurs.udemyjava.dziedziczenie.youtube;

public class Main {
    public static void main(String[] args){
        Cat kot = new Cat();
        kot.dajGlos();
        kot.idz();
        Animall pies;
        System.out.println();

        try{
            pies = new Dog("asd");
            pies.dajGlos();
            ((Dog)pies).idz();
            int a = 5 / 0;
        }
        catch(ClassCastException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Inny błąd");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Wykonuje sie i tak");
        }

    }
}
