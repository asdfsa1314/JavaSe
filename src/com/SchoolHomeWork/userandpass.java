package com.SchoolHomeWork;

import java.util.Properties;
import java.util.Scanner;

public class userandpass {
    public static void main(String[] args) {
        Properties pp = new Properties();

        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = s.next();

        pp.setProperty("用户名", username);
        System.out.println("请输入密码");
        String pass = s.next();
        pp.setProperty("密码", pass);

        while (true){
        if ("admin".equals(pp.getProperty("用户名")) && "888888".equals(pp.getProperty("密码"))){
            System.out.println("输入正确");
            break;
        }else {
            System.out.println("请重新输入");
        }
        }

    }
}
