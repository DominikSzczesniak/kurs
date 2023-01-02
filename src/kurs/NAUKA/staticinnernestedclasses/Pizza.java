package kurs.NAUKA.staticinnernestedclasses;

import kurs.NAUKA.enumcoding.PizzaSize;

public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private boolean isExtratomatoSauce;
    private boolean isSalad;

    private Pizza(Builder builder) {
        this.name = builder.name;
        this.pizzaSize = builder.pizzaSize;
        this.isExtratomatoSauce = builder.isExtratomatoSauce;
        this.isSalad = builder.isSalad;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean isExtratomatoSauce() {
        return isExtratomatoSauce;
    }

    public boolean isSalad() {
        return isSalad;
    }

    public static class Builder{
        private String name;
        private PizzaSize pizzaSize;
        private boolean isExtratomatoSauce;
        private boolean isSalad;

        Builder(String name, PizzaSize pizzaSize){
            this.name = name;
            this.pizzaSize = pizzaSize;
        }

        public Builder withExtraTomatoSauce(boolean isExtratomatoSauce){
            this.isExtratomatoSauce = isExtratomatoSauce;
            return this;
        }

        public Builder withSalad(boolean isSalad){
            this.isSalad = isSalad;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }

    }
}
