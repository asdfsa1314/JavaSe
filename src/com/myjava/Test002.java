package com.myjava;

//import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
//import java.util.ConcurrentModificationException;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//把iterator看完了，还自己理解了ConcurrentModificationException这个异常是为什么发生的，看源码还是挺爽的

/**
 * 关于集合遍历/迭代专题。（重点：五颗星*****）
 */
public class Test002 {
    public static void main(String[] args) {
        // 注意：以下讲解的遍历方式/迭代方式，是所有Collection通用的一种方式。
        // 在Map集合中不能用。在所有的Collection以及子类中使用。
        // 创建集合对象
        Collection c = new ArrayList(); // 后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代。
        // 添加元素

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        // 对集合Collection进行遍历/迭代
        // 第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();         //获取迭代器必须在添加或者减少数据之后迭代，集合修改后，迭代器也要修改

        // 第二步：通过以上获取的迭代器对象开始迭代/遍历集合。
        /*
            以下两个方法是迭代器对象Iterator中的方法：
                boolean hasNext()如果仍有元素可以迭代，则返回 true。
                Object next() 返回迭代的下一个元素。
         */
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // 一直取，不判断，会出现异常：java.util.NoSuchElementException
        /*while(true){
            Object obj = it.next();
            System.out.println(obj);
        }*/

        /*boolean hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext) {
            // 不管你当初存进去什么，取出来统一都是Object。
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext) {
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext) {
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext) {
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        System.out.println(hasNext);
        if(hasNext) {
            Object obj = it.next();
            System.out.println(obj);
        }*/
    }
}
