package com.sex;

import java.util.Objects;

public class Women extends Room implements Fucked{

    SexKit sexkit;
    String name;
    int age;
    int sexTime;

    public Women(){}
    public Women(String name,  SexKit sexkit, int age, int sexTime){
        this.name = name;

        this.age = age;
        this.sexTime = sexTime;
        this.sexkit = sexkit;
    }

    @Override
    public String toString() {
        return "Women{" +
                "[姓名]='" + name + '\'' +
                ", [年龄]=" + age +
                ", [性交次数]=" + sexTime +
                '}';
    }




    @Override
    public void fuck(Men men, Women women) {
        System.out.println(women.name + "撅起屁股，" + "满脸通红");
        sexkit.use(men, women);
    }

    @Override
    public void bray(Men men, Women women) {
        System.out.println(women.name +"大声的叫了出来,在" +women.sexkit.sexkit+"的作用下，抽搐不止");

    }
}
