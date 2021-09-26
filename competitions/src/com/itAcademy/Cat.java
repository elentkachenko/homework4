package com.itAcademy;

class Cat extends Animal {
    public Cat(String type, String name, int run, int swim, double jump) {
        super(type, name, run, swim, jump);
    }

    final int MAX_RUN_DISTANCE = 200;
    final int MAX_SWIM_DISTANCE = 0;
    final double MAX_JUMP_HEIGHT = 2;
}

