package com.example.task21;

public class Mammal {
    private int energyLevel ;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Mammal() {
        this.energyLevel = 100;

    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public int energyLevel() {
        return this.energyLevel ;
    }
}
