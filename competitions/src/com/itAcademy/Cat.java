package com.itAcademy;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super("Кот", name);
    }

    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_SWIM_DISTANCE = 0;
    private final double MAX_JUMP_HEIGHT = 2;

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height <= MAX_JUMP_HEIGHT) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            return true;
        } else {
            return false;
        }
    }
}

