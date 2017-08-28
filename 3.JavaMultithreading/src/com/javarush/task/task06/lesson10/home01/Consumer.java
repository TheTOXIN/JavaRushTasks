package com.javarush.task.task06.lesson10.home01;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    protected BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String str;
            while (true) {
                str = queue.take();
                System.out.println(str);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] This is fucking thread the broke", Thread.currentThread().getName()));
        }
    }
}
