package com.myjava;

public class Test005 <随便写>{
    public static void main(String[] args) {
        String flag = "bich";

        Test005 t5 = new Test005();

        t5.doSome(234);
        t5.toSome(flag);
    }

    public void toSome(String o){
        System.out.println(o);
    }

    public void doSome(随便写 o){
        System.out.println(o);
    }
}
