package com.IOTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class UnXuLieHua {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\asdfsa\\Desktop\\list"));
        List<Student> AA = (List<Student>)ois.readObject();

        for (Student list: AA) {
            System.out.println(list);
        }

    }
}
