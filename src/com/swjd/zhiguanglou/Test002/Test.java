package com.swjd.zhiguanglou.Test002;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        double pay = 0;
        double shop;
        boolean vip;

        Scanner s = new Scanner(System.in);
        System.out.println("请输入是否是会员:是(y)/否(其他字符)");
        String flag = s.next();;
        if("y".equals(flag)){
            vip = true;
        }else {
            vip = false;
        }
        System.out.print("请输入购物金额:");
        shop = s.nextDouble();

        System.out.println(" ");
        user u = new user(vip, shop);

        System.out.print("实际支付：" + u.FanHui());






    }

}
