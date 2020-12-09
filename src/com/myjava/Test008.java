package com.myjava;

import java.util.ArrayList;

public class Test008 {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        AL.add("fuck you bich");
        AL.add("fuck you dog");
        AL.add("fuck you pig");

        System.out.println(AL.get(0));

        if (AL.contains("fuck you dog")) {
            System.out.println("包含dog");
        }


    }
}
