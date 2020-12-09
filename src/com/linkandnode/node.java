package com.linkandnode;


/**link
 * see next, date
 */
public class node extends link{
    //装数据的一个地方
    Object date;
    //装下一个节点的地方
    node next;
    //提供构造方法，用于初始化节点里面的值
    public node(){}
    public node(Object date, node next){   this.date = date;  this.next = next;}
    public String toString() {
        return "node{" +
                "date=" + date +
                ", next=" + next +
                '}';
    }
}
