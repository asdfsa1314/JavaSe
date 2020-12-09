package com.HomeWork.Test;

public class Student implements Comparable<Student> {
    float aest;
    int age;
    String name;

    public Student(){}
    public Student(float aest,int age,String name){
        this.aest = aest;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "学生[" +
                "成绩 =" + aest +
                "年龄 =" + age +
                "名字 ='" + name + '\'' +
                ']';
    }

    public int compareTo(Student o) {
        if (aest == o.aest){return this.name.compareTo(o.name); }
        return (int)(this.aest - o.aest);
    }
}
