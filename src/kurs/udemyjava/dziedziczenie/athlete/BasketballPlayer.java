package kurs.udemyjava.dziedziczenie.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete{
    public BasketballPlayer(String name, String nickname, int yearOfBirth, String team, double freeThrowPercentage, double pointPerGame, int gamesPlayed) {
        super(name, nickname, yearOfBirth, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointPerGame = pointPerGame;
    }
    private double freeThrowPercentage;
    private double pointPerGame;


    public void freeThrow(){
        Random rnd = new Random();
        if ((rnd.nextDouble() * 100) > freeThrowPercentage)
            System.out.println(getName() + " failed to score free throw.");
        else System.out.println(getName() + " scored free throw.");
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage: " + freeThrowPercentage);
        System.out.println("Points per game: " + pointPerGame);
    }

    @Override
    public void compete() {
        super.compete();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Tall and lean muscle";
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setPointPerGame(double pointPerGame) {
        this.pointPerGame = pointPerGame;
    }
}
