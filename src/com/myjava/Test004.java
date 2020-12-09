package com.myjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test004 <标识符是可以随便写的>{

        public static void main(String[] args) {
            List<bich> lbich = new ArrayList<>();
            lbich.add(new bich("cxk", 0));
            lbich.add(new bich("xz", 0));

            Iterator it1 = lbich.iterator();

            //这种for循环来获得集合的方法，仅限于存在下标的集合，如果是set集合就不行了。因为set集合是无序不重复的。
            for (bich date : lbich){
                System.out.println(date);
            }


        }
}