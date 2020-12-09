package com.myjava;


import java.util.Scanner;

//转换是用31进行转换
public class Test017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        String flag1 = s.next();
        String sum="";
        while (i < flag1.length()){
            char a = flag1.charAt(i);
            String flag2 = "" + a;

            if (isNumeric(flag2)){

            }else {
                char b = (char) (a-31);
                String flag4 = "" + b;
               sum = sum + flag4;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
                }
            }
            return true;
        }
}
