package com.itAcademy;

public class Barrier implements ObstacleTour {
    private final double barrierHeight;

    public Barrier(double barrierHeight) {
        this.barrierHeight = barrierHeight;
    }

    @Override
    public void execute(Team team) {
        Animal[] animals = team.getAnimals();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].jump(barrierHeight)) {
                System.out.println(String.format("%s %s перепрыгнул барьер высостой %s м.", animals[i].getType(), animals[i].getName(), barrierHeight));
            } else {
                System.out.println(String.format("%s %s не перепрыгнул барьер высостой %s м.", animals[i].getType(), animals[i].getName(), barrierHeight));
            }
        }

    }
}
