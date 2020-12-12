package com.Reflect;

import java.util.Date;

public class ReflectTest {
    public static void main(String[] args) {
        Date bich = new Date();
        //Class中是不需要创建对象来调用方法的，getClass是Object的方法，每一个类默认继承了Object，所以都有getClass方法来获取类
        Class c1 = null;
//        try {
//            c1 = Class.forName("java.util.Random");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        c1 = "java.util.Date".getClass();
//        try {
//            c1.newInstance();//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        System.out.println(c1);
    }
}
