package com.HomeWork;


import java.util.Iterator;
import java.util.Map;

import java.util.HashMap;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        System.out.println(map.size());


        Set<Integer> set = map.keySet();
        for (Iterator<Integer> it1 = set.iterator(); it1.hasNext();){
            int a = it1.next();

            System.out.println(a + "号是" + map.get(a));
        }
        map.put(5, "郭靖");
        System.out.println();
        map.remove(2);
        map.put(2, "周林");

        for (Iterator<Integer> it1 = set.iterator(); it1.hasNext();){
            int a = it1.next();

            System.out.println(a + "号是" + map.get(a));
        }

    }
}
