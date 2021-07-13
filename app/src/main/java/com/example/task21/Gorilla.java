package com.example.task21;

public class Gorilla extends Mammal {
    private static int FOOD_INCREASE = 10;

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public Gorilla() {
    }

    public int throwSomething() {
        return this.energyLevel() - 5;

    }

    public int eatBananas() {
        return this.energyLevel() + FOOD_INCREASE;
    }

    public int climb() {
        return this.energyLevel() - 10;

    }

}
