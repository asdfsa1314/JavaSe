package com.IOTest.HunHe;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    String name;
    String no;
    String sex;
    String mailbox;
    String birthday;

    private static final long serialVersionUID = 23414143422L;

    public Student(){}
    //用于比较
    public Student(String a){
        this.no = a;
    }
    public String toString() {
        return
                "   " + no + '\t' +
                "   " + name + '\t' +
                "   " + sex + '\t';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(no, student.no) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(mailbox, student.mailbox) &&
                Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no, sex, mailbox, birthday);
    }

    public Student(String name, String no, String sex, String mailbox, String birthday){
        this.birthday = birthday;
        this.mailbox = mailbox;
        this.name = name;
        this.no = no;
        this.sex =sex;
    }



}
