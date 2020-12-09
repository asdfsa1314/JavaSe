package com.IOTest;

import java.io.*;

public class FileCopePrimer {
    public static void main(String[] args) throws Exception{
        //定义两个流，分别负责写入数据与输出数据。
        File shuchu = null;
        File xieru = null;

        //传入这个方法写入数据的绝对路径与输出数据的绝对路径
        copyDir(xieru, shuchu);
    }


    //定义一个方法，用于拷贝所有的
    private static void copyDir(File srcFile, File destFile) {
        if(srcFile.isFile()) {
            // srcFile如果是一个文件的话，递归结束。
            // 是文件的时候需要拷贝。
            // ....一边读一边写。
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                // 读这个文件
                // D:\course\02-JavaSE\document\JavaSE进阶讲义\JavaSE进阶-01-面向对象.pdf
                in = new FileInputStream(srcFile);
                // 写到这个文件中
                // C:\course\02-JavaSE\document\JavaSE进阶讲义\JavaSE进阶-01-面向对象.pdf
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")  + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                // 一边读一边写
                byte[] bytes = new byte[1024 * 1024]; // 一次复制1MB
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        // 获取源下面的子目录
        File[] files = srcFile.listFiles();
        for(File file : files){
            // 获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                // 新建对应的目录
                //System.out.println(file.getAbsolutePath());
                //D:\course\02-JavaSE\document\JavaSE进阶讲义       源目录
                //C:\course\02-JavaSE\document\JavaSE进阶讲义       目标目录
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")  + srcDir.substring(3);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            // 递归调用
            copyDir(file, destFile);
        }
    }
}