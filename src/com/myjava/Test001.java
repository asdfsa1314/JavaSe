package com.myjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
//import java.util.Collections;

public class Test001 {
    public static void main(String[] args) {

    }
}
class Student{
    int no;
    String name;
    boolean sex;

    public Student(int no, String name, boolean sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && sex == student.sex && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, sex);
    }
}

