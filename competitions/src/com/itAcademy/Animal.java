package com.itAcademy;

public abstract class Animal {

    private final String type;
    private final String name;
    private final int run;
    private final int swim;
    private final double jump;

    public Animal(String type, String name, int run, int swim, double jump) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public int getMAX_RUN_DISTANCE() {
        return 0;
    }

    public int getMAX_SWIM_DISTANCE() {
        return 0;
    }

    public double getMAX_JUMP_HEIGHT() {
        return 0;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }


}
