package kurs.udemyjava.OBJECTSUPERCLASS.objecttostring;

public enum PizzaSize {
    SMALL("Small"), MEDIUM("Medium"), LARGE("Large");

    private String pizzaSizeText;

    PizzaSize(String pizzaSizeText){
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
