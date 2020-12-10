package com.ThreadTest.homeWork;

public class ThreatAll {
}

class Threat1 implements  Runnable{

    SaleTick st = null;

    public Threat1(SaleTick st) {
        this.st = st;
    }

    public void run() {
        while (true) {
            try {
                st.saleTicket();
            } catch (NoBus noBus) {
                System.out.println(noBus.getMessage());
                break;
            }
        }
    }
}

class Threat2 implements Runnable{
    SaleTick st = null;

    public Threat2(SaleTick st) {
        this.st = st;
    }

    public void run() {
        while (true){
            try {
                st.saleTicket();
            } catch (NoBus noBus) {
                System.out.println(noBus.getMessage());
                break;
            }
        }
    }
}