package com.javarush.task.task08.task11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List<? extends String> getListForGet()
    {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        return arrayList;
    }

    public static List<? extends String> getListForSet()
    {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        return arrayList;
    }

    public static List<? extends String> getListForAddOrInsert()
    {
        //напишите тут ваш код
        LinkedList<String> linkedList = new LinkedList<String>();
        return linkedList;
    }

    public static List<? extends String> getListForRemove()
    {
        //напишите тут ваш код
        LinkedList<String> linkedList = new LinkedList<String>();
        return linkedList;
    }
}
