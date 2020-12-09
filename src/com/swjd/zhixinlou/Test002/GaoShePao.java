package com.swjd.zhixinlou.Test002;

public class GaoShePao  extends Weapon implements Attackable{


    //new完高射炮的时候，再调用fanhui这个方法，也相当于，new了一个武器对象，并且把值保存在里面
    public Weapon FanHui () {
        Weapon gaoShePao = new Weapon();
        gaoShePao.Defend=(50.0);
        gaoShePao.Attack=(50.0);
        gaoShePao.model=(3001);
        gaoShePao.weaponName = ("高射炮");
        return gaoShePao;
    }

    //该武器实现的接口
    public void attack(){
        System.out.println("高射炮做出了攻击");
    }
}
