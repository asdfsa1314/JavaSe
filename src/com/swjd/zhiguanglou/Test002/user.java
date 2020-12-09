package com.swjd.zhiguanglou.Test002;

public class user {
    boolean vip;
    double pay = 0;
    double shop;


    public user (){}
    public user (boolean a, double c){
        this.vip = a;

        this.shop = c;
    }

    public double FanHui(){
    if (vip = false) {
       if (shop >= 100) {
           pay = shop * 0.9;
       }else {pay = shop;}

    }else {
        if (shop < 200){
        pay = shop * 0.8;
        }
        else{
        pay = shop * 0.75;
        }
    }

        return pay;
    }


    public String toString(){
        if (vip = true) {
            return "是VIP" + "购物金额:" + shop + "实际金额:" + pay;
        }else {
            return "不是VIP" + "购物金额:" + shop + "实际金额:" + pay;
        }
    }

}
