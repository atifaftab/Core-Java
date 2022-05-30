package com.immutable;

public final class ImmutableExample {

    private final int id;
    final private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ImmutableExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        ImmutableExample a = new ImmutableExample(1,"ATIF");
        System.out.println(a.name.equals("ATIF"));
    }

}



