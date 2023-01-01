package kurs.NAUKA.statickeyword;

public class Country {
    public Country(String name, int population, String capital) {
        this.NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    static{
        numberOfCountries = 5;
    }
    static {
        numberOfCountries = 0;
    }

    private final String NAME;
    private int population;
    private String capital;
    private static int numberOfCountries;


    public final void populationChange(int change){
        population += change;
    }

    public void getDetails(){
        System.out.println("Country: " + NAME + ", Population: " + population + ", Capital: " + capital);
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }
}
