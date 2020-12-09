package com.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RDTest {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int flag = rd.nextInt(101);
            al.add(flag);
        }

        Iterator<Integer> it = al.iterator();

        for (Integer a : al){
            System.out.println(a);
        }

    }
}
