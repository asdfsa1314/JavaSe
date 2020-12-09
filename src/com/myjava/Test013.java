package com.myjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test013 {
    public static void main(String[] args) {
        byte[] bytes = {98 ,99 ,100 ,101};
        FileOutputStream fos = null;
        try {
        fos = new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\patchwork\\Boring\\sb", true);
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException f){
            f.getStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            }catch (IOException f){f.getStackTrace();}
        }
    }
}
