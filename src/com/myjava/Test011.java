package com.myjava;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Test011 {
    public static void main(String[] args){
        FileInputStream fis = null;
        byte[] fuck = new byte[2];
        try {
            fis = new FileInputStream("C:\\Users\\asdfsa\\Desktop\\patchwork\\Boring\\sb");
            int dex = fis.read(fuck);


            System.out.println(new String(fuck, 0, dex));

            dex = fis.read(fuck);
            System.out.println(new String(fuck, 0, dex));


            String flag = new String(fuck, 0, dex);




            System.out.println("==============================");
            System.out.println(flag);
            System.out.println("==============================第二个 利用字符串拼接");
            System.out.println();
            System.out.println("==============================第二个 利用Byth数组的toString方法");

        }catch (IOException a){
            a.fillInStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
