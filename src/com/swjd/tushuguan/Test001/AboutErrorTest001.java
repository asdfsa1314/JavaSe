package com.swjd.tushuguan.Test001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AboutErrorTest001 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        System.out.println("begin");
        m2();
        System.out.println("end");
    }
    public static void m2(){

        try {
            new FileInputStream("C:\\Users\\asdfsa\\Desktop\\studyJava\\mark\\11-2>\\方法与构造方法.md");//为什么还是出现错误呢？
            // 其原因时错误并没有解决，可以尝试错误上抛或者try...catch进行捕捉错误
        }catch(FileNotFoundException a){
            a.fillInStackTrace();
        }
    }




}
