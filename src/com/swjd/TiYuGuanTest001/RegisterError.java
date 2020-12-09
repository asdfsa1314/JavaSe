package com.swjd.TiYuGuanTest001;



//异常要集成父类
public class RegisterError extends Exception{

    //调用异常父类的无参构造器
    public RegisterError(){ super();}


    //调用异常父类的有参构造器
    public RegisterError(String s){ super(s); }




}
