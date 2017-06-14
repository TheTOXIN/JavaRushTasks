package com.javarush.task.task04.lesson08.bonus03;

public class Singleton
{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        return INSTANCE;
    }

}
