package com.ThreadTest.synchronizedTest;

public class SynchronizedTest3 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        t1 t1 = new t1(o1, o2);
        t2 t2 = new t2(o1, o2);

        t1.start();
        t2.start();

    }
}

class t1 extends Thread{
    Object o1 = null;
    Object o2 = null;

    public t1(){}

    public t1(Object a, Object b){
        this.o1 = a;
        this.o2 = b;
    }

    public void run() {
        synchronized(o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(o2){

            }
        }

        System.out.println("t1程序执行完了");
    }
}


class t2 extends Thread{
    Object o1 = null;
    Object o2 = null;

    public t2(){}

    public t2(Object a, Object b){
        this.o1 = a;
        this.o2 = b;
    }

    public void run() {
        synchronized(o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(o1){

            }
        }

        System.out.println("t2程序执行完了");
    }
}