package com.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectFieldTest {
    public static void main(String[] args) throws Exception{
        //获取类的对象(student)
        Class myStudent = Class.forName("com.Reflect.Student");

        //通过类对象来获取public的属性
        Field[] fields1 = myStudent.getFields();
        System.out.println(fields1.length);
        System.out.println(fields1[0]);
        //想要获得修饰符列表，必须要通过Field里面的getType方法与Class里面的getModifiers方法，
        int a = fields1[0].getType().getModifiers();
        //通过这个静态方法能把得到的修饰符列表int值，转换为string的值.
        String m = Modifier.toString(a);
        System.out.println(m);

        //通过类对象来获取所有的属性
        Field[] fields = myStudent.getDeclaredFields();
        Class v = fields[1].getType();

        System.out.println(v.getName());//通过length来列出该数组中存放了多少个属性

    }
}
