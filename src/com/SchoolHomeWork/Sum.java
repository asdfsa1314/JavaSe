package com.SchoolHomeWork;

public class Sum {
    public static void main(String[] args) {
        // 2 3 5 8 13 21就是2加上1的自增

        //1 2 3  5 8 13 就是1加上1的自增
        int flag1 = 1;
        int flag2 = 2;
        int sum = 0;

        for(int i = 0; i < 20; i++) {
            sum = (flag2++)/(flag1++) + sum;
        }

        System.out.println(sum);

    }
}
