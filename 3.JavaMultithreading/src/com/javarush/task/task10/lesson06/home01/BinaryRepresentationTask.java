package com.javarush.task.task10.lesson06.home01;

import java.util.concurrent.RecursiveTask;

public class BinaryRepresentationTask extends RecursiveTask<String> {
    private int x;

    @Override
    protected String compute() {
        int a = x % 2;
        x = x / 2;
        String result = String.valueOf(a);
        if (x > 0) {
            return compute() + result;
        }
        return result;
    }

    public BinaryRepresentationTask(int x) {
        this.x = x;
    }
}
