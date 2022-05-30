package com.thread;

//extending Thread class
public class MyThread extends Thread {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

