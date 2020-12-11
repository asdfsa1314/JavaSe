package com.ThreadTest.MathSynchronizedTread;

public class Test {
    public static void main(String[] args) {
        Number i = new Number(1);
        Thread t1 = new Thread(new T1(i));
        Thread t2 = new Thread(new T2(i));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

        System.out.println("开始");
    }
}
