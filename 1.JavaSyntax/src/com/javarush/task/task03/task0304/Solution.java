package com.javarush.task.task03.task0304;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int j = 1;
        for (int i = 1; i <= 10; i++) {
            j *= i;
        }

        System.out.println(j);

    }
}