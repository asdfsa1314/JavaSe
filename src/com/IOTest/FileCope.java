package com.IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCope {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File file = new File("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\12-3\\a");

        //定义一个下标，如果是-1则停止拷贝
        //定义一个byte数组，用于拷贝数据;建议使用1024 *1024


        //检测目录是否有文件，有的话返回true
        if (file.isDirectory()){
            //把文件拷贝进入files数组
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                //声明文件路径，每次拷贝完成后要切换IO流所对应的文件路径，比如说甲——>乙
                fis = new FileInputStream(files[i]);
                fos = new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\12-3\\b\\"+ i +".chm");//利用字符串拼接，制造String地址，文件名就叫i。

                //定义好用于数据传输的两个量
                int index = 0;
                byte[] bytes1 = new byte[1024 * 1024];

                //等于 - 1 才执行里面的
                while ((index = fis.read(bytes1)) != -1) {
                    fos.write(bytes1, 0 , index);
                    //给出用户提示，文件拷贝完成

                }
                System.out.println(i+"号文件拷贝完毕");
                fos.flush();
            }
        }
        //用于关闭流的if逻辑
        if (fis != null){fis.close();}
        if (fos != null){fos.close();}
    }
}
