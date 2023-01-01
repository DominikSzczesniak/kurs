package kurs.NAUKA.finalkeyword;

public class Country {
    public Country(String name, int population, String capital) {
        this.NAME = name;
        this.population = population;
        this.capital = capital;
    }

    private final String NAME;
    private int population;
    private String capital;

    public final void populationChange(int change){
        population += change;
    }
}
