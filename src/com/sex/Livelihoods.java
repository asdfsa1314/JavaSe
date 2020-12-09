package com.sex;

import java.util.Objects;

public class Livelihoods extends Room implements Used{

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livelihoods that = (Livelihoods) o;
        return Objects.equals(livelihood, that.livelihood);
    }

    public int hashCode() {
        return Objects.hash(livelihood);
    }

    String livelihood;

    public String toString() {
        return livelihood;
    }


    public Livelihoods(){}
    public Livelihoods(String a){
        this.livelihood = a;

    }

    public void use(Men men, Women women){
        System.out.println(men.name +"使用"+ livelihood);
        System.out.println(women.name + "防备心、耻辱心降低了");
    }
}
