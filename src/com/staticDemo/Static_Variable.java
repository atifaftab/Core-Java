package com.staticDemo;

public class Static_Variable {

    static int a;
    static int b;

    Static_Variable() {
        a = 10;
    }

    int calc_b() {
        b = a + 10;
        return b;
    }

    void print_val() {
        System.out.println(this.b);
    }

    public static void main(String args[]) {
        Static_Variable v = new Static_Variable();
        v.calc_b();
        v.print_val();
        Static_Variable v1 = new Static_Variable();
        v1.print_val();
    }
}