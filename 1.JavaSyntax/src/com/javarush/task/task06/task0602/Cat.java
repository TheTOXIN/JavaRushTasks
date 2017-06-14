package com.javarush.task.task06.task0602;

/* Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat
{
    protected void finalize() throws Throwable{
        System.out.println("Уничтожен");
    }

}

class Dog
{
    protected void finalize() throws Throwable{
        System.out.println("Уничтожен");
    }

}