package com.SchoolHomeWork;

import java.util.Scanner;

public class SchoolReport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] asd = new double[5];
        int index = 0;
        double sum;

        for (int i = 0; i < asd.length; i++){
            System.out.println("请输入"+i+"号同学的成绩");
            asd[i] = s.nextInt();
            System.out.println(i+"号装载完毕");
            if (asd[i] >= 80) {
                index++;
            }
        }
        sum = index / 5 * 100;

        System.out.println("80以上人数的百分比是"+sum+"%");

    }
}
