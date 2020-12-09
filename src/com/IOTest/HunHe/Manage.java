package com.IOTest.HunHe;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
//import java.util.Properties;

public class Manage implements ManageMethod{
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    List<Student> list = null;
//    Properties pp = null;
    Scanner s = null;
    public Manage(){
        list = new ArrayList<>();


    }

    public void close(){
        if (ois!=null){
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (oos!=null){
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setOut(String shuchu) {
        try {
            this.oos = new ObjectOutputStream(new FileOutputStream(shuchu.endsWith("\\")?shuchu+"Date":shuchu+"\\Date"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void setInput(String shuru) {
        try {
            this.ois = new ObjectInputStream(new FileInputStream(shuru.endsWith("\\")?shuru+"Date":shuru+"\\Date"));
            list = (List<Student>)ois.readObject();
            System.out.println("对象读取完成");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("对象的类型不匹配");
        }
    }


    public void detailed() {
        //如果列表为空，则会返回列表为空的信息，不为空就会继续执行
        System.out.println("请输入学生的编号");
        s = new Scanner(System.in);
        int flag = s.nextInt();
        System.out.println("下面是该学生的详细信息");
        System.out.println("性别"+list.get(flag).sex);
        System.out.println("姓名"+list.get(flag).name);
        System.out.println("邮箱"+list.get(flag).mailbox);
        System.out.println("生日"+list.get(flag).birthday);

    }


    public void DelStudent() {
        Iterator<Student> it = list.iterator();
        System.out.println("请输入删除的学号");
        s = new Scanner(System.in);
        String input = s.next();
        while (it.hasNext()){
            if(it.next().no.equals(input)){
                it.remove();
                System.out.println("移除完毕，此学号被删除");
                return;
            }
        }

        System.out.println("删除失败，此列表里面没此学号");

    }

    public void AddStudent() {
        //下面是用于添加学生姓名，有一套请求输入的流程
        //还要添加过滤的流程
        s = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String flag1;
        flag1 = s.next();
//        if (flag1.isEmpty() || flag1.contains("@") || flag1.contains("#") || flag1.contains("$")||flag1.contains("%")||flag1.contains("^")||flag1.contains("&")||flag1.contains("*")){
//            System.out.println("输入非法字符");
//            return;
//        }else {
//            System.out.println("姓名输入完成 = =");
//        }

        System.out.println("请输入学号:");
        String flag2;
        flag2 = s.next();

        //        if (flag2.isEmpty() || flag2.contains("@") || flag2.contains("#") || flag2.contains("$")||flag2.contains("%")||flag2.contains("^")||flag2.contains("&")||flag2 .contains("*")){
//            System.out.println("输入非法字符");
//            return;
//        }

        System.out.println("请输入性别:");
        String flag3;
        flag3 = s.next();

        System.out.println("请输入邮箱:");
        String flag4;
        flag4 = s.next();

        System.out.println("出生日期");
        String flag5;
        flag5 = s.next();

        Student a = new Student(flag1, flag2, flag3, flag4, flag5);
        list.add(a);
        System.out.println("学生"+flag1+"号添加完成");
    }

    @Override
    public void keep() {

        try {
            oos.writeObject(list);
            System.out.println("对象冻结完成");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void Teble() {

        //把列表里面的所有学生元素都列出来
        for (int i = 0; i < list.size(); i++){
            System.out.println("编号:"+ i +"  " +list.get(i).no + "   "+list.get(i).name + "   " + list.get(i).sex);
        }
    }

    @Override
    public void read() {

    }


}
