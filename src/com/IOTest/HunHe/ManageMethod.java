package com.IOTest.HunHe;

public interface ManageMethod {

    //定义一个关闭接口
    void close();

    //定义输入路线
    void setInput(String shuru);

    //定义输出路线
    void setOut(String shuchu);

    //定义一个返回的方法，用于得出详细信息
    void detailed();

    //定义一个方法用于删除学生
    void DelStudent();

    //定义一个方法用于添加学生
    void AddStudent();

    //定义一个方法用于保存数据
    void keep();

    //定义一个方法用于列出列表
    void Teble();

    //定义一个方法用于读取数据
    void read();
}
