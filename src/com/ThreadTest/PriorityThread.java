package com.ThreadTest;

import java.io.PrintStream;

public class PriorityThread {
    public static void main(String[] args) {
//        PrintStream printf = new PrintStream(System.out);
        Thread_1 thread_1 = new Thread_1();
        Thread main = Thread.currentThread();

        main.setPriority(10);

        thread_1.setPriority(1);
        thread_1.start();
        System.out.println("最低优先级-->"+ Thread.MAX_PRIORITY);
        System.out.println("最高优先级-->" + Thread.MIN_PRIORITY);
        System.out.println("默认优先级-->"+Thread.NORM_PRIORITY);


//        main.stop();//这个是关闭线程，但是由于是静态方法的原因，无论是什么引用.stop()，此代码在编译的时候还是使用的Thread.stop();
        System.out.println("main方法的优先级是"+main.getPriority());


//        .close();
    }
}

class Thread_1 extends Thread{

    public void run() {
        Thread thread = Thread.currentThread();

            System.out.println("Thread的优先级是" + thread.getPriority());

    }
}