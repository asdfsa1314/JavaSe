package com.IOTest.HunHe;

public class Test {
    public static void main(String[] args) {

        Manage manage = new Manage();
//
//        System.out.println("按[0]退出系统,按[1]保存表格,按[2],[3],");
//        while(true) {
//
//       ? manage.setInput("C:\\Users\\asdfsa\\Desktop");



//        manage.AddStudent();

        //这个东西保存要在程序结束后再执行
        manage.setOut("C:\\Users\\asdfsa\\Desktop");
        manage.setInput("C:\\Users\\asdfsa\\Desktop");
        System.out.println("   " + "编号" + '\t' + "   " + "姓名" + '\t' + "   " + "性别" + '\t');
        manage.Teble();



        manage.close();

    }
}
