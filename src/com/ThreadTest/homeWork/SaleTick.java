package com.ThreadTest.homeWork;

import java.util.ArrayList;
import java.util.List;

public class SaleTick implements sale{
    public List<Ticket> getArr() {
        return arr;
    }

    public void setArr(List<Ticket> arr) {
        this.arr = arr;
    }

    private List<Ticket> arr = null;
    public SaleTick() {
        //要生成两百张票
        arr = new ArrayList<>();
        for (int i = 0; i < 20000 ; i++){
            arr.add(new Ticket("常德", 80));
        }
    }

    public synchronized  void  saleTicket() throws NoBus {

            if (arr.isEmpty()) {
                NoBus a = new NoBus("票卖完了");
                throw a;
            }

                arr.remove(0);

            System.out.println("购买票成功");

    }

    public void saleFood() {;
        new NoBus("没有食物了");
    }

}
