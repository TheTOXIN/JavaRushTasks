package com.javarush.task.task06.bonus0603;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5]; // создаем массив на 5 значений

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine()); //заполняем массив циклом на 5 вводов с клавиатуры
        }

        for (int k = 0; k < array.length - 1; k++) // сортировка "пузырьком", цикл внутри цикла
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                int tmp = 0;
                if (array[i] > array[i + 1])
                {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) //выводим цикл на печать
        {
            System.out.println(array[i]);
        }
    }
}
