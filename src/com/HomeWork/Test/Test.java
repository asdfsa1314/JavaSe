package com.HomeWork.Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student lisi = new Student(90.0f, 22, "李四");
        Student liusan = new Student(90.0F, 20, "刘三");
        Student sunliu = new Student(99.0F, 22	, "孙刘");

        List<Student> list = new ArrayList<Student>();
        list.add(lisi);
        list.add(liusan);
        list.add(sunliu);

        TreeSet<Student> set = new TreeSet<Student>(list);
        for (Iterator<Student> it1 = set.iterator(); it1.hasNext(); ){
            System.out.println(it1.next());
        }
    }
}
