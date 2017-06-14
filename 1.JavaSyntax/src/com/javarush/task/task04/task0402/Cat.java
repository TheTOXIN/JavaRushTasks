package com.javarush.task.task04.task0402;

/**
 * Created by noliv_000 on 24.10.2014.
 */
/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        Cat cat = new Cat();
        catsCount++;
    }
}