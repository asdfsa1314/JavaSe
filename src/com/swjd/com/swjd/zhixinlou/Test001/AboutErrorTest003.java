package com.swjd.com.swjd.zhixinlou.Test001;

public class AboutErrorTest003 {
    public static void main(String[] args){
//       ;
        System.out.println( m1());
        System.out.println( m1());
    }
    public static int m1(){
        int i = 100;
        try {
            return i;
        } finally {
            i++;
            return i;
        }
    }
}
