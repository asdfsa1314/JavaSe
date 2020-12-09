package com.ThreadTest;

public class MyThread {
    public static void main(String[] args) {
        ThreadTest1 t = new ThreadTest1();

        Thread flag1 = new Thread(t);
        //用Thread里面的start方法，也能进行多线程的操作
        flag1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程-->" + i + "号");
        }
    }
}

class ThreadTest1 implements Runnable {
    //这个run就是用于进行优雅的终止进程的
    boolean run = true;
    public void run() {
        //如果为false就会优雅的终止进程
        if (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println("分支线程-->" + i + "号");
            }
        }else {
            return;//这里就可以执行保存数据的代码
        }
    }
}