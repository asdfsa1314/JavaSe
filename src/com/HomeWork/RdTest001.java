package com.HomeWork;

import java.util.Random;

public class RdTest001 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int shu[]=new int[10];
        int temp=0;//用来前后两数的交换更替
        boolean b=true;//判断是否提前排序完毕的标志
        Random ran=new Random();
        for(int i=0;i<shu.length;){
            shu[i]=ran.nextInt(10);
            if(check(shu,shu[i],i)){
                i++;
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(shu[i]+"号 ");
            if (i == 4){
                System.out.print("是一组");
                System.out.println();
            }
            if (i == 9){
                System.out.print("是一组");
            }
        }
    }
    //判断是否与数组中其他值相同
    public static boolean check(int c[],int t,int j){
        for(int  i=0;i<c.length;i++){
            if(c[i]==t&&j!=i){
                return false;
            }
        }
        return true;
    }

}
