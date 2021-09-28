package com.itAcademy;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Лучик"),
                new Cat("Ерик"),
                new Dog("Майя"),
                new Dog("Рыжик")
        };
        Team team = new Team("Ракета", animals);
        ObstacleTour[] obstacleTour = new ObstacleTour[]{
                new Track(190),
                new Pool(5),
                new Barrier(1.2)
        };
        for (ObstacleTour obstacle : obstacleTour) {
            obstacle.execute(team);
        }
    }
}



