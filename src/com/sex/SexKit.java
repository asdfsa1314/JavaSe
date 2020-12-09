package com.sex;

import java.util.Objects;

public class SexKit extends Room implements Used{

    String sexkit;

    public String toString() {
        return sexkit;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexKit sexKit = (SexKit) o;
        return Objects.equals(sexkit, sexKit.sexkit);
    }


    public int hashCode() {
        return Objects.hash(sexkit);
    }




    public SexKit(){}
    public SexKit(String sexkit){
        this.sexkit = sexkit;

    }



    public void use(Men men, Women women) {
        System.out.println( men.name +"对"+ women.name +"使用了" +sexkit );
        System.out.println(women.name+"更愉悦了");

    }


}
