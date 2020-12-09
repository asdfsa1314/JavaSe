package com.sex;

import java.util.Objects;
import java.util.Scanner;

public class Room {
    String room;
    int no;


    public Room() {
    }

    public Room(String a, int b) {
        this.no = b;
        this.room = a;
    }

    public void sex(Men men, Women women) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("按[1]进入做爱系统，按[0]退出系统");
            int flag1 = s.nextInt();
            if (flag1 == 1) {
                System.out.println("按[1]就是男的草，按[2]就是女的草");
                System.out.println("按[3]就是男的叫，按[4]就是女的叫");
                int flag = s.nextInt();
                switch (flag) {
                    case 1:
                        men.fuck(men, women);
                        break;
                    case 2:
                        women.fuck(men, women);
                        break;
                    case 3:
                        men.bray(men, women);
                        break;
                    case 4:
                        women.bray(men, women);
                        break;

                }
            }else {break;}
        }

    }
}