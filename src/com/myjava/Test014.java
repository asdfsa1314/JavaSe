package com.myjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test014 {
    public static void main(String[] args) {

        FileReader fr = null;

        FileWriter fw = null;

        try {
            fr = new FileReader("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\11-23\\sb.txt");

            fw = new FileWriter("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\12-2\\cnm.txt");

            char[] fuck = new char[1024 * 1024];
            int dexin = 0;

            while ((dexin = fr.read(fuck)) != -1){
                fw.write(fuck, 0, dexin);
            }
            }catch (FileNotFoundException e){
                e.getStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }


    }
}
