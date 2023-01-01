package kurs.NAUKA.dziedziczenie.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant", "Black Mamba",
                1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointPerGame(25.5);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan", "MJ",
                1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic",
                1959, "Lakers", 84.8, 19.5, 906);

        BasketballPlayer[] basketballPlayers = {kobe, jordan, magic};
        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            System.out.println("-------------------------------------------------");
            basketballPlayer.compete();
            System.out.println("-------------------------------------------------");
            basketballPlayer.getBio();
            System.out.println(basketballPlayer.getBodyType());
        }

        FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 209, 9912, 5223);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootballPlayer ed = new FootballPlayer("Ed Brady", "Ed Terrific", 1997, "New England Patriots", 42, 4292, 2932);
            ed.setTeam("Tampa Bay");
            FootballPlayer[] footballPlayers = {tom, ed};
            for (FootballPlayer footballer : footballPlayers){
                System.out.println("--------------------------------------------");
                footballer.compete();
                System.out.println("--------------------------------------------");
                footballer.getBio();
                System.out.println(footballer.getBodyType());
        }

            Swimmer katinka = new Swimmer("Katinka Hosszu", "Iron lady", 1989, "Team Iron", 542, 432);
        System.out.println("--------------------------------------------");
        katinka.compete();
        katinka.freestyle(100);
        katinka.freestyle(200);
        System.out.println("--------------------------------------------");
        katinka.getBio();
        System.out.println(katinka.getBodyType());

    }
}
