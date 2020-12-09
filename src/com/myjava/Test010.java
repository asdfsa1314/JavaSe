package com.myjava;
import java.util.Properties;
public class Test010 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("用户名:", "fuckyoubich");
        properties.setProperty("账户:", "cnmshabi");


        String username = properties.getProperty("用户名:");
        String password = properties.getProperty("账户:");

        System.out.println(username);
        System.out.println(password);
    }
}
