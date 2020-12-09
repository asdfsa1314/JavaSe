package com.linkandnode;

public class link {
    node heard = null;

    public void add(Object date) {
        if (heard == null) {
            //如果头节点为空，说明还没有节点对象，就new一个新节点出来
            heard = new node(date, null);
        } else {
            //找末尾节点，并且赋上下一个末尾节点的地址

            node lastNode = findLast(heard);
            lastNode.next = new node(date, null);
        }
    }

    public node findLast(node o){
        //如果下一个地址为null，则说明是最后一个地址，返回他他本身的地址
        if (o.next == null){
            return o;
        }
        return findLast(o);
    }

    //查找链表中的上一个节点，并且返回链表的date
    public node findpre(int index) {

        node rnode = heard;
        int dex = -1;
        while (rnode.next != null) {
            //找到了插入节点的上一个节点
            if (dex == index - 1) {
                return rnode;
            }
            rnode = rnode.next;
            dex++;

        }
        return null;
    }

        public void remove (Object obj){

    }


}
