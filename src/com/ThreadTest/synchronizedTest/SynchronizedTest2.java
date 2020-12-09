package com.ThreadTest.synchronizedTest;

public class SynchronizedTest2 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Test1 t1 = new Test1(mc);
        Test1 t2 = new Test1(mc);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main方法睡觉了");
    }
}

class Test1 extends Thread {
    private MyClass mc;
    public Test1 (){}
    public Test1 (MyClass a){
        this.mc = a;
    }

    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOhther();
        }
    }
}

class MyClass{
    public synchronized void doSome(){
        System.out.println("是安全线程");
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("Begin");


//        System.out.println("End");
    }

    public synchronized void doOhther(){
//        System.out.println("Begin");
        System.out.println("吊毛傻逼安全线程");
//        System.out.println("End");
    }
}