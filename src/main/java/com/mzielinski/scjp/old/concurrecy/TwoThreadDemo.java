package com.mzielinski.scjp.old.concurrecy;

/**
 * @author mzielinski, Rule Financial
 */
class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE!" + getName());
    }
}

public class TwoThreadDemo {
    public static void main(String[] args) {
        new SimpleThread("Java Programmer").start();    //line A
        new SimpleThread("Java Programmer").start();    //line B
    }
}