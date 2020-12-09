package com.sex;

import java.util.Objects;

public class Men extends Room implements Fucked{
    String name;
    int age;
    int sexTime;
    SexKit sexkit;
    Livelihoods livelihoods;
    @Override
    public String toString() {
        return "Men{" +
                "[名字]='" + name + '\'' +
                " [年龄]=" + age +
                " [性交次数]=" + sexTime +
                '}';
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Men men = (Men) o;
        return age == men.age &&
                sexTime == men.sexTime &&
                Objects.equals(name, men.name) &&
                Objects.equals(sexkit, men.sexkit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, sexTime, sexkit);
    }

    public Men(){}
    public Men(String name, int age, int sexTime, SexKit sexkit, Livelihoods livelihoods){
        this.name = name;
        this.livelihoods = livelihoods;
        this.age = age;
        this.sexTime = sexTime;
        this.sexkit = sexkit;
    }



    public void fuck(Men men, Women women) {
        System.out.println(men.name + "舔着" + women.name+ "的阴唇");
        System.out.println(men.name+"使用了"+ sexkit.sexkit);
        sexkit.use(men,women);
        System.out.println(women.name + "已经湿了");
        System.out.println(name +"深吸一口气");

        livelihoods.use(men,women);
        System.out.println(name + "用力插入" + women.name +"阴道");

    }


    public void bray(Men men, Women women) {
        System.out.println(men.name + "抓着"+ women.name +"头发"+ ",呼呼的喘气");

    }
}
