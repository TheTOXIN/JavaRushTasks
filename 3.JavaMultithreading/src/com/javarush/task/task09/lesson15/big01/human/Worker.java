package com.javarush.task.task09.lesson15.big01.human;

public class Worker {
    private Human human;
    private double salary;
    public String company;

    public Worker(String name, int age)
    {
        human = new Human(false);
    }

    public void live() {
        human.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSlr(double salary) {
        this.salary = salary;
    }
}
