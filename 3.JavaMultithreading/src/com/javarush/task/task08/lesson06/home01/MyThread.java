package com.javarush.task.task08.lesson06.home01;

public class MyThread extends Thread {
    private static int countPriority = 0;
    private int priority;
    private boolean isHasGroup = false;

    public MyThread() {
        init();
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        isHasGroup = true;
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        isHasGroup = true;
        init();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        isHasGroup = true;
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        isHasGroup = true;
    }

    public void init() {

        priority = ++countPriority;

        if (priority == Thread.MAX_PRIORITY) {
            countPriority = 0;
        }

        if (isHasGroup && priority > getThreadGroup().getMaxPriority()) {
            priority = getThreadGroup().getMaxPriority();
        }

        setPriority(priority);
    }
}
