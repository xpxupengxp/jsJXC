package com.js.util.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args){
        final long timeInterval = 1000*5;
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {
                    Date day=new Date();
                    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
                    String format2 = df.format(day);
                    System.out.println(format2);

                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
