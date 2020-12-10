package com.ThreadTest.homeWork;

public class Test {
    public static void main(String[] args) {
        SaleTick st = new SaleTick();
        Thread t1 = new Thread(new Threat1(st));
        Thread t2 = new Thread(new Threat2(st));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
