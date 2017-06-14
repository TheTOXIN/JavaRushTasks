package com.javarush.task.task03.task0302;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        String name = "Макс";

        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 10; j++){
                System.out.print(name + " ");
            }
            System.out.println();
        }

    }
}