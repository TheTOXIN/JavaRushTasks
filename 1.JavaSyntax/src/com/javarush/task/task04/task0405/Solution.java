package com.javarush.task.task04.task0405;

/**
 * Created by noliv_000 on 24.10.2014.
 */
/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}