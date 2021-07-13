package com.example.task21;

public class Bat {
    private int energyLevel ;
    static int flyLevel = 50  ;
    static int eatLevel = 25  ;
    static int attackLevel = 100 ;
    public Bat(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Bat() {
        this.energyLevel = 300;

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
    public int fly () {
        return this.energyLevel-flyLevel ;
    }
    public int eatHumans(){
        return this.energyLevel+eatLevel ;
    }
    public int attackTown(){
        return this.energyLevel-attackLevel ;
    }


}
