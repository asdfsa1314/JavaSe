package com.SchoolHomeWork;


import java.util.Scanner;

public class Test002 {

        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int number;
            System.out.println("请输入数字：");
            number=input.nextInt();

            if((number%5==0)&&(number%6==0))
            System.out.println("该数能被5，6整除");
		else
            {if(number%5==0) {
                System.out.println("该数能被5整除");}
                if(number%6==0) {
                    System.out.println("该数能被6整除");}}



        }



    }

