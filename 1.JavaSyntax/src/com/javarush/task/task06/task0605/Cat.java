package com.javarush.task.task06.task0605;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat
{
    static int catCount = 0;

    public Cat(){
        catCount++;
    }

}
