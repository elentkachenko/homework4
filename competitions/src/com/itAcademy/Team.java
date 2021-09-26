package com.itAcademy;

public class Team {
    public Team(String teamName) {
        Team team = new Team("Огонь");
        Animal[] competitors = new Animal[4];
        competitors[0] = new Cat("Кот", "Лучик", 199, 0, 1.9);
        competitors[1] = new Cat("Кот", "Мурзик", 155, 0, 1.2);
        competitors[2] = new Dog("Собака", "Майя", 450, 9, 0.3);
        competitors[3] = new Dog("Собака", "Рекс", 300, 30, 0.2);
    }

}


