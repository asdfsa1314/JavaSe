package com.myjava;

import java.util.Random;
import java.util.Scanner;

public class Test018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = 0;
        int[] asdfsa = new int[5];

        for (int i = 0 ;i < asdfsa.length ;i++ ){
            System.out.println("请输入成绩");
            asdfsa[i] = s.nextInt();
            System.out.println(i+"号装载完毕");
            if (asdfsa[i] >= 80){
                index++;
            }
        }

        double asd = (float) index / (float) 5 * 100;
        System.out.println("百分比是"+asd+"%");
    }
}
