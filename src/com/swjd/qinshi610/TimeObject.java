package com.swjd.qinshi610;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.logging.SimpleFormatter;

public class TimeObject {
    public void logn(String msg) {
        //这个工具的gat只能获取时间
        Date date = new Date();
        //这个工具用于日期的处理
        SimpleDateFormat sldf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        //创造一个输入流，内含一个节点流;
        PrintStream pf = null;
        try {
            pf.println("fuckyoubicjjjjjjjjjjjjjj");
            pf = new PrintStream(new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\12-3\\log.txt", true));
            System.setOut(pf);//切换了输出方向，从控制台输出，切换成了输出到文件
//            pf.println(sldf.format(date) + ":"+msg);
            pf.println("fuckyoubicjjjjjjjjjjjjjj");

        }catch (FileNotFoundException f){
            f.getStackTrace();
        }finally {
            pf.close();
        }

    }
}
