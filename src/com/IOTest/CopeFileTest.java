package com.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopeFileTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;    //写出
        FileInputStream fis = null; //写入
        try {
            fis = new FileInputStream("C:\\Users\\asdfsa\\Desktop\\studyKail\\项目\\相遇.rar");
            fos = new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\studyKail\\bich.rar");

            int index = 0;
            byte[] bytes = new byte[1024 * 1024];
            while ((index = (fis.read(bytes))) != -1){
                fos.write(bytes);

            }
            fos.flush();


        }catch (FileNotFoundException e){e.getStackTrace();}
        catch (IOException io){io.getStackTrace();}
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
