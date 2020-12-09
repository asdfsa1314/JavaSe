package com.myjava;

import java.util.Scanner;

public class Test019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        double r = 0, zong;
        System.out.print("请输入收入:");
        a = s.nextInt();

        if (a < 500) {
            r = 0;
        } else if (a >= 500 && a < 1000) {
            r = 0.03;
        } else if (a >= 1000 && a < 2000) {
            r = 0.05;
        } else if (a >= 2000 && a < 5000) {
            r = 0.08;
        } else if (a >= 5000) {
            r = 0.12;

        }

        //这是实际上得到的金额
        zong = a - a * r;

        //这是税率 -> r
        //这是输入的时候，也就是收入总金额 ->a
        System.out.println("税率={"+r+"},应交税款={"+(r*a)+"},实得金额={"+zong+"}");

    }
}