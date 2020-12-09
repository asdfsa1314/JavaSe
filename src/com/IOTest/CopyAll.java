package com.IOTest;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        File input = new File("C:\\Users\\asdfsa\\Desktop\\studyJava\\code");
        File out = new File("C:\\Users\\asdfsa\\Desktop\\");

        copyfuck(input, out);
    }

    private static void copyfuck(File input, File out) {
        //如果是文件就返回，提供递归的结束条件
        if (input.isFile()){
        //如果是文件就执行一边读一边写的操作
            FileInputStream fis = null;
            FileOutputStream fos = null;


            try {
                String path = (out.getAbsolutePath().endsWith("\\")?out.getAbsolutePath():out.getAbsolutePath()+"\\") + input.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);
                fis = new FileInputStream(input);
                System.out.println(path);


                int index = 0;
                byte[] bytes = new byte[1024 * 1024];

                while ((index = fis.read(bytes)) != -1){
                    fos.write(bytes, 0, index);
                }

                fos.flush();//别忘记了刷新流
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null){
                    try {
                        fos.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


            return;
        }

        File[] files = input.listFiles();

        for (File file : files){
            //如果是目录，就执行以下的代码
            if (file.isDirectory()){
                //创建目标的文件夹，因为拷贝肯定是连着文件夹一起拷贝的嘛
                String path = (out.getAbsolutePath().endsWith("\\")?out.getAbsolutePath():out.getAbsolutePath()+"\\") + file.getAbsolutePath().substring(3);
                File file1 = new File(path);

                //判断这个目录存不存在，如果存在就执行花括号里面的语句
                if (!file1.exists()){
                    //目录不存在，制造于目录相同的文件夹名
                    file1.mkdirs();
                }
            }

            copyfuck(file , out);

        }
    }
}
