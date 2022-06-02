package com.interfaces.impl;

import com.interfaces.FunctionalInterfaceDemo;

public class FunctionalInterfaceImpl {

    public static void main(String[] args) {
        FunctionalInterfaceDemo obj = () -> System.out.println(" Hell yeah");
        obj.print();
    }
}
