package com.swjd.tushuguan.Test001;

public class AboutErrorTest002 {
    public static void main(String[] args){
        try {
            System.out.println("这是首句子");
            return;


        }finally {
            System.out.println("return小垃圾");
        }
//       这里的语句无法执行
//         System.out.println();
    }
}
