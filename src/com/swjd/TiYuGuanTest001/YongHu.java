package com.swjd.TiYuGuanTest001;

//这个类的作用就是定义用户的属性
//方便存入数组，注册完了就保存在数组里面


public class YongHu {
    String username;
    String password;

    public YongHu() {}
    public YongHu(String no, String type) {this.username = no; this.password = type;}

    //重写equals方法
    public boolean equals(Object obj) {
        if (obj == null || obj instanceof YongHu) {return false;}
        if (this == obj){return true;}
        //进行强制类型转换
        YongHu yongHu = (YongHu) obj;
        return yongHu.username == this.username && yongHu.password == yongHu.password;
    }
    //重写toString方法
    public String toString(){ return "用户名" + username + "——" + "密码" + password; }

}
