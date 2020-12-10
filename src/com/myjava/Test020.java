package com.myjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test020 {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date first = sdf.parse("2020-12-10 09:25:00");
        timer.schedule(new DingShiQi(), first, 1000 * 5);//定时器，现在时间，间隔多久的时间
    }
}
class DingShiQi extends TimerTask{
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        String nowdate = sdf.format(new Date());
        System.out.println(nowdate + "系统时间数据备份完毕");
    }
}