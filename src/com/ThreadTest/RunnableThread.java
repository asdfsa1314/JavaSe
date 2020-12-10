package com.ThreadTest;

import java.util.concurrent.*;

public class RunnableThread {
    public static void main (String[] args) throws Exception {
        FutureTask tr = new FutureTask(new ThreadRunnable()) ;
        Thread thread = new Thread(tr);
        thread.start();
        System.out.println(tr.get());//此线程要被阻塞，等thread线程执行完毕后返回值后再进入就绪状态

    }
}

class ThreadRunnable implements Callable {
    public Object call() throws Exception {
        int a = 3;
        int b = 4;
        return a + b;
    }
}