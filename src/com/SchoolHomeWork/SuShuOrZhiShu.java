package com.SchoolHomeWork;

public class SuShuOrZhiShu {
    public static void main(String[] args) {
        boolean flag;
       for (int j = 200; ;j++){
           flag = isSushu(j);
            if (flag){
                System.out.println("最小素数是"+j);
                break;
            }
       }
    }

    public static boolean isSushu(int number){
        //若此数小于2，则不是质数
        if(number<2){
            return false;
        }
        //从1-number本身循环取余计算
        for(int i=1;i<number;i++){
            if(number % i == 0){//余数为0，能整除
                if(number == i){//是否是本身
                    return true;
                }else if(i!=1){//是否是1,能被一个不是1的数整除，而且不是自己本身，说明就是一个非素
                    return false;
                }
            }
        }
        return true;
    }
}