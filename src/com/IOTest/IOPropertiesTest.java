package com.IOTest;

import java.io.FileInputStream;
//import java.io.ObjectInputStream;
//import java.io.IOException;
//import java.io.Reader;
import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;


public class IOPropertiesTest {
    public static void main(String[] args) throws Exception {

        Properties pp = null;
        Scanner s = new Scanner(System.in);
        while (true) {
            FileReader fr = new FileReader("C:\\Users\\asdfsa\\Desktop\\1.txt");
            System.out.println("请输入数字,【1】是退出系统，【0】打印表单");
            int flag = s.nextInt();

            if (flag == 1) {
                fr.close();
                break;
            } else if (flag == 0){

                pp = new Properties();
                pp.load(fr);

                System.out.println(pp.getProperty("username"));
                System.out.println(pp.getProperty("pass"));
            }else {
                System.out.println("出错了！");
            }
        }
    }
}