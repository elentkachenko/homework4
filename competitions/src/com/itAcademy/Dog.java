package com.itAcademy;

class Dog extends Animal {
    public Dog(String type, String name, int run, int swim, double jump) {
        super(type, name, run, swim, jump);
    }

    final int MAX_RUN_DISTANCE = 500;
    final int MAX_SWIM_DISTANCE = 10;
    final double MAX_JUMP_HEIGHT = 0.5;

}

