package com.javarush.task.task05.lesson05.home01;

public class LoggingStateThread extends Thread {

    private final Thread logThread;
    private State logState;

    public LoggingStateThread(Thread logThread) {
        this.logThread = logThread;
        this.logState = logThread.getState();
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println(logState);
        while (logState != State.TERMINATED) {
            logState = logThread.getState();
            System.out.println(logState);
        }
        System.out.println(logState);
    }
}
