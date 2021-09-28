package com.itAcademy;

public abstract class Animal {
    public Animal() {
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    private String type;
    private String name;

    public abstract boolean run(int distance);

    public abstract boolean jump(double height);

    public abstract boolean swim(int distance);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
