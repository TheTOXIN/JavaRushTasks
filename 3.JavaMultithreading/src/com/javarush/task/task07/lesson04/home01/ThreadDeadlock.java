package com.javarush.task.task07.lesson04.home01;

public class ThreadDeadlock {
    Object data;
    public synchronized Object getData() {
        return data;
    }
}
