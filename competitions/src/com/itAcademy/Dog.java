package com.itAcademy;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super("Собака", name);
    }

    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private final double MAX_JUMP_HEIGHT = 0.5;

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



