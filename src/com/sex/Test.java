package com.sex;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("使用什么生计用品:");
        Used b = new Livelihoods(s.next());
        System.out.println("使用什么情趣用品");
        Used a = new SexKit(s.next());

        System.out.println("输入女性的名字:");

        Women xiaohua = new Women(s.next(),  (SexKit) a, 18, 0);
        System.out.println("输入男性的名字:");
        Men jianglin = new Men(s.next(), 18, 0, (SexKit) a, (Livelihoods) b);
        System.out.println("输入住什么房间：");
        Room room = new Room(s.next(), 001);
        room.sex(jianglin, xiaohua);


    }
}
