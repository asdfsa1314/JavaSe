package com.IOTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XuLieHua {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        List<Student> fuck = null;

        list.add(new Student(1, "张钰鹭"));

        list.add(new Student(2, "张钰鹭"));





        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\list"));
        oos.writeObject(list);
        oos.flush();
        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\asdfsa\\Desktop\\list"));
//        int index;
//        byte[] bytes = new byte[1024 * 1024];


        //        ObjectOutputStream oos = null;
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\asdfsa\\Desktop\\list"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        oos.write();
////        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\asdfsa\\Desktop\\studyJava\\code\\12-3\\a"));
//
//        try {
//            oos.writeObject(list);
//            oos.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //每次弄完要刷新



//
//        if (oos != null) {
//            try {
//                oos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("Student 已经装在完毕");

    }
}