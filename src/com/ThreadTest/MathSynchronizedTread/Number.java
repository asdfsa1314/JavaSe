package com.ThreadTest.MathSynchronizedTread;

import java.util.Objects;

public class Number {

    @Override
    public String toString() {
        return "i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return i == number.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    public int getI() {

        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Number(int i) {
        this.i = i;
    }

    private int i;

}
