package com.Reflect;

import java.lang.reflect.Constructor;

public class ConAndRef {
    @Override
    public String toString() {
        return "ConAndRef{}";
    }

    public static void main(String[] args) throws  Exception{


        //设置无参构造
        Constructor c = Student.class.getConstructor();

        //创建对象的时候自动调用无参数的构造器
        c.newInstance();

    }
}
