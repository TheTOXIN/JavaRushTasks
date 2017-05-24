package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat c1 = new Cat("Мурзик1");
        Cat c2 = new Cat("Мурзик2");
        Cat c3 = new Cat("Мурзик3");
        Cat c4 = new Cat("Мурзик4");
        Cat c5 = new Cat("Мурзик5");
        Cat c6 = new Cat("Мурзик6");
        Cat c7 = new Cat("Мурзик7");
        Cat c8 = new Cat("Мурзик8");
        Cat c9 = new Cat("Мурзик9");
        Cat c10 = new Cat("Мурзик10");
        map.put("Мурзик1", c1 );
        map.put("Мурзик2", c2 );
        map.put("Мурзик3", c3 );
        map.put("Мурзик4", c4 );
        map.put("Мурзик5", c5 );
        map.put("Мурзик6", c6 );
        map.put("Мурзик7", c7 );
        map.put("Мурзик8", c8 );
        map.put("Мурзик9", c9 );
        map.put("Мурзик10", c10 );
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set <Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String,Cat> x : map.entrySet())
        {
            Cat a = x.getValue();
            cats.add(a);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
