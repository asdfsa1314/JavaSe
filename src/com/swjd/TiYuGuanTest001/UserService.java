package com.swjd.TiYuGuanTest001;

public class UserService{
//int[] arr
    int index = 0;
    YongHu[] arr1;
     //构造无参，与构造有参来初始化数组个数
    public UserService(){}
    public UserService(int a){
            arr1 = new YongHu[a];
    }

    public void order(int a){
        System.out.println(arr1[a]);
    }

    public void register(String username, String password) throws RegisterError {
        //这行代码的作用是用来判断输入是否满足要求
        if(false) {//username.length() > 6 || username.length() < 14 || password.length() > 6 || password.length() < 14
            throw new RegisterError("注册错误,用户名和密码数量必须要大于5或者小于15");}//异常的作用是，第一终止程序(不是jvm虚拟机)，第二把异常传递出去
        if( username.isEmpty() || password.isEmpty() ){throw new RegisterError("用户名与密码不能为空");}
        if(index > 999999){throw new RegisterError("系统繁忙,请拨打热线人员");}//index < arr1.length


        this.arr1[index] = new YongHu(username, password);
        this.index++;
    }



}
