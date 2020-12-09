package com.swjd.HomeWork.Test001;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //设置工具，关于获取随机数的工具
        Random rd = new Random();

        //设置数组，设置一个能保存10个数字的数组
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            rd.ints(1, 100);

        }
    }
}
