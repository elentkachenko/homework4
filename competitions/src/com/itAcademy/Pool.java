package com.itAcademy;

public class Pool implements ObstacleTour {
    private final int poolDistance;

    public Pool(int poolDistance) {
        this.poolDistance = poolDistance;
    }

    @Override
    public void execute(Team team) {
        Animal[] animals = team.getAnimals();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].swim(poolDistance)) {
                System.out.println(String.format("%s %s проплыл дистанцию %s м.", animals[i].getType(), animals[i].getName(), poolDistance));
            } else {
                System.out.println(String.format("%s %s не проплыл дистанцию %s м.", animals[i].getType(), animals[i].getName(), poolDistance));
            }
        }
    }

}

