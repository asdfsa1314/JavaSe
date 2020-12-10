package com.myjava;

public class Test021 {
    public static void main(String[] args) {
        boolean flag = false;
        int sum = 0;
        for (int number = 200; ; number++){

            //从1-number本身循环取余计算
            for(int i=2 ;i<=number; i++){
                if (number % i == 0 && number != i){
                    flag = false;
                    break;
                }else if (number % i == 0 && number == i){//zs
                    flag = true;
                    break;
                }
            }
            if (flag){
                sum = number;
                break;
            }
        }

        System.out.println(sum);
    }
}
