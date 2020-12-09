package com.HomeWork;

import java.util.*;

public class QQTest {

    public static void main(String[] args) {
        Set<Character> ll = new TreeSet<>();

        StringBuffer sb = new StringBuffer();
        char[] asdfsa;
        String fuck;
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};

        for(int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);

        }
            fuck = sb.toString();

        asdfsa = fuck.toCharArray();
        for(int i = 0; i < asdfsa.length ; i++) {
            ll.add(asdfsa[i]);
        }


        for (Iterator<Character> it = ll.iterator();it.hasNext();){
            System.out.println(it.next());
        }


    }
}
