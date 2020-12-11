package com.ThreadTest.MathSynchronizedTread;

public class ThearAll {
}

class  T1 implements Runnable {
    public T1(Number number) {
        this.number = number;
    }

    Number number = null;

    @Override
    public void run() {
        while (number.getI() <= 100) {
            synchronized (number) {
                if (number.getI() % 2 == 0) {//偶数
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //不是偶数就输出奇数
                System.out.println(Thread.currentThread().getName() + "-->" + number.getI());
                number.setI(number.getI() + 1);
                number.notifyAll();
            }
        }
    }
}
class  T2 implements Runnable {
    public T2(Number number) {
        this.number = number;
    }

    Number number = null;

    @Override
    public void run() {
        while (number.getI() <= 100) {
            synchronized (number) {
                if (number.getI() % 2 == 1) {//奇数
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //不是奇数就输出偶数
                System.out.println(Thread.currentThread().getName() + "-->" + number.getI());
                number.setI(number.getI() + 1);
                number.notifyAll();
            }
        }
    }
}