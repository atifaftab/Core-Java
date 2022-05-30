package com.singleton;

 /*
private the constructor
static object
static method returning that object
*/

public class SingletonDemo {


    static SingletonDemo obj = new SingletonDemo();

    private SingletonDemo(){

    }

     public static SingletonDemo getInstance(){
        return obj;
     }



}
