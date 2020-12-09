package com.myjava;

import java.util.List;
import java.awt.*;
import java.util.ArrayList;
//import java.util.t;
import java.util.Collection;
import java.util.Iterator;

public class Test003 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        String s1 = "abc";
        c.add("anc");

        Iterator it = c.iterator();
        List list1 = new ArrayList();
        list1.size();//获得集合中当前元素的个数，不是获得元素的总量。
        //当然，也可以通过ArrayList里面的构造方法，初始化元素的总量，默认值为10.



//        System.out.println();
//
//
//        System.out.println(c.contains(s1));//比较的是内容，而不是内存地址，底层调用的equals，看包装类是否重写了equals，不然自动调用了Object中的equals，比较的是内存地址

    }
}
