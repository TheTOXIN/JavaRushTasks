package com.javarush.task.task08.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов,
которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> setcats = new HashSet<Cat>();
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        setcats.add(c1);
        setcats.add(c2);
        setcats.add(c3);
        return setcats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat text : cats)
        {
            System.out.println(text);
        }
    }

    public static class Cat
    {

    }
}
