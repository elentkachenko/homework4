package com.itAcademy;

public class Team {
    private String nameTeam;
    private Animal[] animals;

    public Team() {
    }

    public Team(String nameTeam, Animal[] animals) {
        this.nameTeam = nameTeam;
        this.animals = animals;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
