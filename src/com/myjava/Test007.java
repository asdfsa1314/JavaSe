package com.myjava;

//import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Test007 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//采用了钻石表达式，自动判断

        map.put(1, "bich");
        map.put(2, "fuck");
        map.put(3, "shit");

        System.out.println("map里面元素的数量:"+ map.size());

        map.remove(2);

        System.out.println("map里面元素的数量:"+ map.size());

        System.out.println(map.get(3));

        map.clear();

        System.out.println("size:"+map.size());

        boolean flag = map.isEmpty();
        System.out.println(flag);

        map.put(1, "bich");
        map.put(2, "fuck");
        map.put(3, "shit");
        System.out.println(map.containsKey(4));

        System.out.println("containsShit"+map.containsValue("shit"));
        System.out.println("contains3" + map.containsKey(3));
    }
}
