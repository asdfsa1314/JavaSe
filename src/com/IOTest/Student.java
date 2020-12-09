package com.IOTest;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    int no;
    transient String name;

    public Student(){}
    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    public int hashCode() {
        return Objects.hash(no, name);
    }

    public String toString() {
        return "学生{" +
                "编号 = " + no +
                "名字 = " + name +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}