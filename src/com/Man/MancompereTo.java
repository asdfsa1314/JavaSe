package com.Man;

import com.sex.Men;

import java.util.Comparator;

public class MancompereTo implements Comparator<Man> {

    //这就是定义了man的比较器

    public int compare(Man a, Man b) {
        if (a.age == b.age) {
            a.name.compareTo(b.name);}
            return a.age - b.age; }
}
