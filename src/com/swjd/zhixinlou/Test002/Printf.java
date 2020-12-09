package com.swjd.zhixinlou.Test002;

/**
 * 主要作用还是用于判断武器的值是否传递进去了
 */
public class Printf {
    public Printf() {

    }

    public void PrintfAttack(Weapon weapon){//
        System.out.println("攻击力;" + weapon.Attack);//getAttack()
    }

    public void PrintfDefend(Weapon weapon){
        System.out.println("防御力:" + weapon.Defend);//.getDefend()
    }

    public void PrintModel(Weapon weapon){
        System.out.println("武器型号:" + weapon.model);//.getModel()
    }

    public void PrintWeaponName(Weapon weapon) {
        System.out.println("武器名字:" + weapon.weaponName);//.getWeaponName()
    }
}
