package com.javarush.task.task09.task08;

/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
