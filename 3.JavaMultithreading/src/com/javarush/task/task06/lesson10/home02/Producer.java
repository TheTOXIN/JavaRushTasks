package com.javarush.task.task06.lesson10.home02;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    protected ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        try {
            for (int i = 1; true; i++) {
                String text = "Some text for " + i;
                System.out.println(text);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("%s thread was terminated", Thread.currentThread().getName()));
        }
    }
}
