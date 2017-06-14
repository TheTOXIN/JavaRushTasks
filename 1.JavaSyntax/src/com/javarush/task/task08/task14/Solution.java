package com.javarush.task.task08.task14;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countN = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            if (name.equals(pair.getValue()))
                countN++;
        }
        return countN;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int countF = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            if (lastName.equals(pair.getKey()))
                countF++;
        }
        return  countF;
    }
}
