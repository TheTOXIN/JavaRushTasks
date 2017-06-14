package com.javarush.task.task09.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем
(количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int i = elements.length;
        System.out.println(i);
        return i;
    }
}
