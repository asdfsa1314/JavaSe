package com.SchoolHomeWork;

public class PrintfXing {
    public static void main(String[] args) {
        //打印输出菱形的上半部分
        for (int i = 0; i <5; i++) {
            for (int j =5; j>i+1; j--) {//打印左上角的空白部分
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++) {//打印*
                System.out.print("*");
            }
            System.out.println();
        }
        //打印输出菱形的下半部分
        for (int i =0; i<4; i++) {
            for (int j = 0; j<i+1; j++) {//打印空白部分
                System.out.print(" ");
            }
            for (int j =0; j<2*(4-i)-1; j++) {//打印*
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
