package com.myjava;

public class Test006 {
    public static void main(String[] args) {
        int[] arr1 = {13131, 121, 900, 700, 214};
        //普通循环数组
        for (int i = 0; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        //超级for循环
        for (int i : arr1){
            System.out.println(i);
        }
    }
}
