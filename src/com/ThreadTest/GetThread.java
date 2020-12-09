package com.ThreadTest;

public class GetThread {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        t1.setName("t1");
        t1.start();





        MyThread1 t2 = new MyThread1();
        t2.setName("t2");
        t2.start();

        System.out.println("main方法观战");
       }
}

class MyThread1 extends Thread{

    public void run(){

        Thread branch = Thread.currentThread();//获取
        for (int i = 0; i < 100; i++) {
            System.out.println(branch.getName()+"-->"+i);

        }


    }
}
