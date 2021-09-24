package com.itAcademy;

class Dog extends Animal {
    public Dog(String type, String name, int run, int swim, double jump) {
        super(type, name, run, swim, jump);
    }

    final int MAX_RUN_DISTANCE = 500;
    final int MAX_SWIM_DISTANCE = 10;
    final double MAX_JUMP_HEIGHT = 0.5;


    Dog maya = new Dog("Собака", "Майя", 450, 9, 0.3);
    Dog rex = new Dog("Собака", "Рекс", 300, 30, 0.2);

//    private final int MAX_RUN_DISTANCE = 120;
//    private final int MAX_SWIM_DISTANCE = 50;
//    private final double MAX_JUMP_HEIGHT = 2.3;
//
//    public int getMAX_RUN_DISTANCE() {
//        return MAX_RUN_DISTANCE;
//    }
//
//    public double getMAX_JUMP_HEIGHT() {
//        return MAX_JUMP_HEIGHT;
//    }
//
//    public int getMAX_SWIM_DISTANCE() {
//        return MAX_SWIM_DISTANCE;
//    }
//

}


