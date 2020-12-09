package com.swjd.tushuguan.Test001;


public class AboutError {
    public static void main(String[] args) {
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.getMessage();
        }
    }
    public static void doSome() throws ClassNotFoundException{
        System.out.println("fuck you");
    }

    //以下代码报错的原因是doSome中的编译错误没有处理，ClassNotFoundException是编译时异常
    //doSome();

    //使用try..catch进行捕捉异常
}
