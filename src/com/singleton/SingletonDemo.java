package com.singleton;

public class SingletonDemo {


    static SingletonDemo obj = new SingletonDemo();

    private SingletonDemo(){

    }

     public static SingletonDemo getInstance(){
        return obj;
     }



}
