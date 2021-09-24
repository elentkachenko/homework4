package com.itAcademy;

class Cat extends Animal {
    public Cat(String type, String name, int run, int swim, double jump) {
        super(type, name, run, swim, jump);
    }

    final int MAX_RUN_DISTANCE = 200;
    final int MAX_SWIM_DISTANCE = 0;
    final double MAX_JUMP_HEIGHT = 2;

    Cat barsik = new Cat("Кот", "Барcик", 190, 0, 1.4);
    Cat murzik = new Cat("Кот", "Мурзик", 155, 0, 1.2);
    Cat luchik = new Cat("Кот", "Лучик", 199, 0, 1.9);

//    public Cat getBarsik() {
//        return barsik;
//    }
//
//    public void setBarsik(Cat barsik) {
//        this.barsik = barsik;
//    }
//
//    public Cat getMurzik() {
//        return murzik;
//    }
//
//    public void setMurzik(Cat murzik) {
//        this.murzik = murzik;
//    }
//
//    public Cat getLuchik() {
//        return luchik;
//    }
//
//    public void setLuchik(Cat luchik) {
//        this.luchik = luchik;
//    }
}

//    private final int MAX_RUN_DISTANCE = 70;
//    private final int MAX_SWIM_DISTANCE = 0;
//    private final double MAX_JUMP_HEIGHT = 4;
//    private String type = "Кот";
//    private String name;
//    private int run;
//    private int swim;
//    private int jump;
//
//    public Cat(String type, String name, int run, int swim, int jump) {
//        this.type = type;
//        this.name = name;
//        this.run = run;
//        this.swim = swim;
//        this.jump = jump;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRun() {
//        return run;
//    }
//
//    public void setRun(int run) {
//        this.run = run;
//    }
//
//    public int getSwim() {
//        return swim;
//    }
//
//    public void setSwim(int swim) {
//        this.swim = swim;
//    }
//
//    public int getJump() {
//        return jump;
//    }
//
//    public void setJump(int jump) {
//        this.jump = jump;
//    }
//
//    public int getMAX_RUN_DISTANCE() {
//        return MAX_RUN_DISTANCE;
//    }
//
//    public int getMAX_SWIM_DISTANCE() {
//        return MAX_SWIM_DISTANCE;
//    }
//
//    public double getMAX_JUMP_HEIGHT() {
//        return MAX_JUMP_HEIGHT;
//    }

