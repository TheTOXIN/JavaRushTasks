package com.javarush.task.task08.lesson15.big01.model;

public class Provider {
    private Strategy strategy;


    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
