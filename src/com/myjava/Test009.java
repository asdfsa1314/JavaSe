package com.myjava;

import java.util.HashMap;
import java.util.Set;

public class Test009 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "帅比");
        map.put(2, "2帅比");
        map.put(1, "1帅比");
        map.put(2, "f帅比");
        map.put(3, "3帅比");

        Set<Integer> a = map.keySet();
        for(Integer key : a){
            System.out.println(key + "是——>"+ map.get(key));
        }

        Set <HashMap.Entry<Integer, String>> set = map.entrySet();

        for ( HashMap.Entry<Integer, String> key : set){
            System.out.println(key);
        }


    }
}
