package com.swjd.TiYuGuanTest001;
import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) {
        //初始化用户数组的个数
        UserService userService = new UserService(999999);
        Scanner scanner = new Scanner(System.in);
            while (true){
            System.out.println("欢迎来到此系统，[1]是进行注册,[0]是退出系统,[2]是系统查询");
            System.out.print("请输入指令:");
            int zhiLing = scanner.nextInt();
            if(zhiLing == 0){return;}
            else if(zhiLing == 1){
                System.out.println("注册");
                String a = scanner.next();
                String b = scanner.next();


            try {
                userService.register(a, b);
            }catch (RegisterError re){ re.printStackTrace(); }
            }
            else if (zhiLing == 2){
                System.out.println("请输入访问的用户序号");
                int flag = scanner.nextInt();
                userService.order(flag); }
            else{System.out.println("出错了！！");} }
    }}
