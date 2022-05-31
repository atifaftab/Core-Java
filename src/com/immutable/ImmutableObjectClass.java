package com.immutable;

/*
make the class final
make the variable final and private
no setter method
make deep copy for Object
*/


public final class  ImmutableObjectClass {

    private final int id;
    final private String name;
    private final Engine engine;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ImmutableObjectClass(int id, String name, Engine engine) {
        Engine engine1 = new Engine(engine.speed);
        this.id = id;
        this.name = name;
        this.engine = engine1;
    }

    public static void main(String[] args) {

        Engine e = new Engine(140);
        ImmutableObjectClass a = new ImmutableObjectClass(1, "ATIF", e);
        System.out.println(a.name.equals("ATIF"));
        System.out.println(a.engine.speed);
        e.speed = 170;
        System.out.println(a.engine.speed);
    }

}

class Engine {
    int speed;

    Engine(int speed) {
        this.speed = speed;
    }
}



