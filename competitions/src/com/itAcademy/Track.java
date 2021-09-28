package com.itAcademy;

public class Track implements ObstacleTour {

    private final int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public void execute(Team team) {
        Animal [] animals = team.getAnimals();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].run(trackDistance)){
                System.out.println(String.format("%s %s пробежал дистанцию %s м.", animals[i].getType(), animals[i].getName(), trackDistance ));
            } else {
                System.out.println(String.format("%s %s не пробежал дистанцию %s м.", animals[i].getType(), animals[i].getName(), trackDistance ));
            }
        }
    }
}
