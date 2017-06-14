package com.javarush.task.task09.lesson15.big01.human;

public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }

}
