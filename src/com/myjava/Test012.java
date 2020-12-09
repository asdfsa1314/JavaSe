package com.myjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test012 {
    public static void main(String[] args) {
        FileInputStream fis =null;
try {


    fis = new FileInputStream("C:\\Users\\asdfsa\\Desktop\\patchwork\\Boring\\sb" );
    try {
        byte[] bytes = new  byte[fis.available()];

        System.out.println(new  String(String.valueOf(fis.read(bytes))));

    } catch (IOException e) {
        e.printStackTrace();
    }

}catch (FileNotFoundException f){f.getStackTrace();}
    finally {
    try {
        fis.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    }
}
