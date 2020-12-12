package com.Reflect;

import java.lang.reflect.Field;

public class FieldReflectTest2 {
    public static void main(String[] args) throws Exception {
        //普通赋值
        Student xiaohuang = new Student();
        xiaohuang.name = "fuck";
        System.out.println(xiaohuang.name);

        //通过反射来进行赋值
        //拿到Class对象
        Class student = Class.forName("com.Reflect.Student");
        Object obj = student.newInstance();//通过Class的创建对象方法，创建一个对象，并且将内存地址赋值给obj

        //拿到Field数据类型(也就是属性),括号内就是想拿到的属性名
        Field hehe = student.getDeclaredField("name");
        hehe.set(obj, "沙雕");
        Student xaohuang = (Student)obj;
        System.out.println(xaohuang.name);
    }
}
