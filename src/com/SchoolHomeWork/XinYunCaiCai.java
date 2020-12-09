package com.SchoolHomeWork;

import java.util.Random;
import java.util.Scanner;
public class XinYunCaiCai {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner s = new Scanner(System.in);

        int denix = 0, flag1, flag2, flag3;
        flag1 = rd.nextInt(100);
        while (true){
            System.out.print("按[1]进入系统，按[0]退出系统");
            flag3 = s.nextInt();
            if (flag3 == 1) {
                System.out.print("请输入您猜的数字;");
                ;
                while (true) {
                    flag2 = s.nextInt();
                    if (flag1 < flag2){
                        System.out.println("大了，请重新输入");
                        denix++;
                    }else if (flag1 > flag2){
                        System.out.println("小了，请重新输入");
                        denix++;
                    }else {
                        System.out.println("恭喜你回答正确");
                        if (denix == 1){
                            System.out.println("你太有才了");
                        }else if (2 > denix && 6 < denix){
                            System.out.println("这么快就猜出来了，很聪明么");
                        }else {
                            System.out.println("猜了半天才猜出来，小同志，尚需努力啊");
                        }

                        break;
                    }
                }
            }else if (flag3 == 0){
                break;
            }
            else {
                System.out.println("出错了!!!");
            }

        }


    }
}
