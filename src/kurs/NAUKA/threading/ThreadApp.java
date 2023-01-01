package kurs.NAUKA.threading;

public class ThreadApp {
    public static void main(String[] args) {
        Obliczenia ob11 = new Obliczenia();
        //Obliczenia ob2 = new Obliczenia();

        Thread ob1 = new Thread(ob11);
        Thread ob2 = new Thread(new Obliczenia());


        ob1.start();
        ob1.start();
        ob2.start();
    }
}
