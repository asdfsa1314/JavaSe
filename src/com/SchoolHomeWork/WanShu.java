package com.SchoolHomeWork;


public class WanShu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.找到这个数的所有因子
        int n = 6;
        //	System.out.println(isPerfectNumber(n));
        System.out.println("1000内的完数为：");
        for (int i = 1; i <= 1000; i++) {
            if (isWanShu(i))
                System.out.println(i);
        }

    }

    public static boolean isWanShu(int n) {
        boolean flag = false;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        //如过因数的和等于自己，就是完数，不是的话就不是完数
        if (sum == n){
            flag = true;//是完数
        }
        return flag;
    }
}