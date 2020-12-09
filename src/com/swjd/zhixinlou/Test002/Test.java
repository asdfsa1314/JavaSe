package com.swjd.zhixinlou.Test002;

import java.util.Collections;

public class Test {
    public static void main(String[] args)  {


//        Collections
        //初始化数组
        Army ar = new Army(9999);
        System.out.println(ar.arr.length);

        //new高射炮
        Attackable attackable = new GaoShePao();//这个高射炮继承了父类武器，又实现了"攻击的"这个接口
//        Weapon gaoshepao = (Weapon) attackable;
        //((GaoShePao) attackable).FanHui();

        //捕捉异常武器空了或者武器满了
        try {
            ar.addWeapon(((GaoShePao) attackable).FanHui());//这个抽象中的高射炮，通过强制类型转换变成了GaoShePao，所以可以调用里面的返回方法。
      // Weapon gaoshepao = (Weapon)attackable 为什么不转成Weapon类型呢？因为Weapon类型中没有返回的值，返回的值是通过武器本身自带的返回方法传递的。
        }catch (ArmyException a){
            a.getMessage();
        }

    }
}


