package com.myjava;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test022 {
    public static void main(String[] args) throws Exception {

        //用来获取当前根目录下的 "" 文件的绝对路径
//        String path = Thread.currentThread().getContextClassLoader()
//                .getResource("com/class.properties").getPath();
//        InputStream fr = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/class.properties");


//        Properties pp = new Properties();

//        FileReader fr = new FileReader(path);
//        pp.load(fr);
//        fr.close();
//        String a = pp.getProperty("classname");
//        System.out.println(a);
//        System.out.println(fr);
        //使用资源绑定器
        ResourceBundle bundle = ResourceBundle.getBundle("class");//这就是绑定src目录里下面的class.properties配置文件
        System.out.println(bundle);

        String classname = bundle.getString("classname");//这就是类似于properties中通过key来获取value
        System.out.println(classname);






    }
}
