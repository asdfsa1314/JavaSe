package com.swjd.zhixinlou.Test002;

import com.swjd.TiYuGuanTest001.YongHu;

/**
 * 定义了防御力Defend，定义了攻击力Attack，定义了型号model，定义了武器名字weaponName.
 */

public class Weapon {
    //封装属性
    double Defend;
//    public double getDefend() { return Defend; }
//    public void setDefend(double defend) { Defend = defend; }
    String weaponName;
//    public String getWeaponName() { return weaponName; }
//    public void setWeaponName(String weaponName) { this.weaponName = weaponName; }
    double Attack;
//    public double getAttack() { return Attack; }
//    public void setAttack(double attack) { Attack = attack; }
    int model;
//    public int getModel() { return model; }
//    public void setModel(int model) { this.model = model; }

    //武器有移动的武器也有攻击的武器
    Modelable modelable;
    Attackable attackable;
    public void setModelable(Modelable modelable){ this.modelable = modelable; }
    public void setAttackable(Attackable attackable){ this.attackable = attackable; }

    //重写equles与重写toString
    public boolean equals(Object obj) {
        if (null == obj || obj instanceof Weapon) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        //进行强制类型转换
        Weapon weapon = (Weapon) obj;
        return weapon.model == this.model && weapon.weaponName.equals(this.weaponName) && this.Attack == weapon.Attack && this.Defend == weapon.Defend;
}

    public String toString() { return "[武器名字]:" + weaponName + "[武器型号]:" + model + "[武器攻击力]" + Attack + "[武器防御力]" +Defend; }




}
