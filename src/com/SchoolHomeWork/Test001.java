package com.SchoolHomeWork;

import java.util.*;
public class Test001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if(number % 5 == 0){
            System.out.println("能被5整除");
        }
        else if(number % 6 == 0){
            System.out.println("能被6整除");
        }
        else if ((number % 5 + number % 6) == 0) {
            System.out.println("能被5和6整除");
        }else {
            System.out.println("不能被5和6整除");
        }



    }
}
