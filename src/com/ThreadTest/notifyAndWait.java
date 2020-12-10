package com.ThreadTest;


//Aim is implement Runnable more Thread

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;

//Used ListArray
public class notifyAndWait {
    public static void main(String[] args) {
        List list = new ArrayList();
        //builder Production Thread and Consume Thread
        Thread t1 = new Thread(new Production(list));
        Thread t2 = new Thread(new Consume(list));

        //set Thread name
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();


    }
}

//production
class Production implements Runnable{
    List list = null;
    public Production(){}
    public Production(List list) {
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (list) {

                if (!list.isEmpty()) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("add food");
                list.add(new Object());
                System.out.println(Thread.currentThread().getName()+"--->"+"apple");

                //使list的上的对象锁被解开
                list.notify();
            }
        }
    }
}


//consume
class Consume implements Runnable{
    List list = null;
//    Production Production;

    public Consume(){}
    public Consume(List list) {
        this.list = list;
//        this.Production = Production;

    }

    public void run() {
        //要保证线程安全
        while (true) {
            synchronized (list) {
                if (list.isEmpty()) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("eating food");
                System.out.println(Thread.currentThread().getName() + "--->移除了" + list.remove(0));

                //使list的上的对象锁被解开
                list.notify();
            }
        }
    }
}