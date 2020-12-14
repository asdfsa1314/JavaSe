package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class BuilderAndReflect {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers()));//修饰符列表
        s.append(" class ");
        s.append(c.getSimpleName());//类名
        s.append(" {\n");

        Constructor[] arr = c.getConstructors();
        for (Constructor b : arr){
            s.append("\t");
            s.append(Modifier.toString(b.getModifiers()));
            s.append(" ");
            s.append(c.getSimpleName());
            s.append("(");

            //拿到参数类型
            Class[] para = b.getParameterTypes();
            for (Class p : para){
                s.append(p.getSimpleName());
                s.append(",");
            }
            //会多出来一个逗号，所有需要删除它
            if (para.length > 0){
                //删除该参数列表后面的逗号
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }
        s.append("}");

        System.out.println(s);
    }
}
