package com.swjd.com.swjd.zhixinlou.Test001;
//
//import static com.swjd.tushuguan.Test001.AboutErrorTest001.m2;


public class AboutErrorTest002 {
    public static void main(String[] args) throws NullPointerException{
        m1();


        System.out.println("傻逼东西草泥马");


    }
    public static void m1() throws NullPointerException{
            String sr = null;

//           try {
               sr.toString();  //空指针异常,这是运行时异常
               System.out.println("这里打印不出来");//异常后面的东西是执行不出来的
//           }catch (n){
//               System.out.println("这里出现了空指针异常");
//           }

    }


        }
