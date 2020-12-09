package com.ThreadTest;

public class SleepThread {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("傻逼东西");
    }
}
