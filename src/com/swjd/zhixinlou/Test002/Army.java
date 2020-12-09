package com.swjd.zhixinlou.Test002;

public class Army {
    Weapon[] arr;

    int index = 0;

    public Army(){}
    public Army(int a){
       this.arr = new Weapon[a];
    }

    //这是武器添加的方法
    public void addWeapon(Weapon weapon) throws ArmyException {

        arr[index] = weapon;
        index++;
        System.out.println(weapon.weaponName + "武器添加成功" + "，是" + index + "号");
        if (index > arr.length) {
            throw new ArmyException("武器已经满了");
        }
    }

    //这是武器减少的方法
    public void subWeapon(Weapon weapon) throws ArmyException {

        arr[index] = null;
        index--;
        System.out.println(weapon.weaponName + "武器添加成功" + "，是" + index + "号");
        if (index < 0) {
            throw new ArmyException("武器已经空了");
        }
    }




    public void attackAll(Attackable attackable){ attackable.attack(); }
    public void moveAll(Modelable modelable){ modelable.model(); }
}
