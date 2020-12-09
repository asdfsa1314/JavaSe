package com.IOTest.HunHe;
import java.util.Scanner;

public class UserManage {
    public static void main(String[] args) {
        System.out.print("欢迎来到学生登陆系统，按[1]进入系统，按[0]退出系统"+'\n');
        Scanner s = new Scanner(System.in);
        Manage manage = new Manage();

        while (true){
            String flag;flag = s.next();

            if (flag.equals("1")) {

                System.out.println("本系统的功能:[1]是保存数据,[2]是查看表格,[3]是添加学生,[4]是删除学生,[5]是查看学生详细信息,[0]退出系统");
                while (true) {
                    int flag1 = s.nextInt();
                    if (flag1 == 1){
                    manage.setOut("C:\\Users\\asdfsa\\Desktop");

                    manage.keep();
                    manage.setInput("C:\\Users\\asdfsa\\Desktop");
                    }
                    else if (flag1 == 2){
                        manage.setInput("C:\\Users\\asdfsa\\Desktop");
                        System.out.println("   " + "    " + " " + "学号"  + "   " + "姓名" + "    "+"性别");manage.Teble();}
                    else if (flag1 == 3){manage.AddStudent();}
                    else if (flag1 == 4){manage.DelStudent();}
                    else if (flag1 == 5){ manage.detailed(); }
                    else if (flag1 == 0){manage.close();break;}
                    else {
                        System.out.println("出错了");}
                }
            }
            else if (flag.equals("0")){
                manage.close();
                break;
            }
            else {
                System.out.print("输入是非法字符"+"\n");
            }
            System.out.println("请在此按[0]退出系统");
        }
    }
}
