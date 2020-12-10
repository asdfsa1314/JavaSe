package com.ThreadTest.homeWork;

//import java.util.List;
import java.util.Objects;

public class Ticket{

    private String Aim;
    private double money;

    public Ticket(String aim, double money) {
        Aim = aim;
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Double.compare(ticket.money, money) == 0 && Objects.equals(Aim, ticket.Aim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Aim, money);
    }

    public String getAim() {
        return Aim;
    }

    public void setAim(String aim) {
        Aim = aim;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "票的终点站" +
                "：" + Aim +
                "张，每一张需要：" + money +
                '元';
    }

}
