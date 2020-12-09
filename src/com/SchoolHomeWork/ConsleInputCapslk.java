package com.SchoolHomeWork;

import java.util.Scanner;

public class ConsleInputCapslk {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a = input.nextInt();
        String str = "";
        String result = " ";
        StringBuffer sb = new StringBuffer();
        while(flag){
            if(a > 0){
                int x = a%10;
                a = a/10;
                switch(x){
                    case 1:  str = "一"; break;
                    case 2:  str = "二"; break;
                    case 3:  str = "三"; break;
                    case 4:  str = "四"; break;
                    case 5:  str = "五"; break;
                    case 6:  str = "六"; break;
                    case 7:  str = "七"; break;
                    case 8:  str = "八"; break;
                    case 9:  str = "九"; break;
                }
                sb.append(result).insert(0,str);
            }else {
                flag = false;
            }
        }
        System.out.println(sb.toString());
    }
}
