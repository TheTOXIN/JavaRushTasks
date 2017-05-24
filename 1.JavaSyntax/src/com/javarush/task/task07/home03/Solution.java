package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> a= new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<20; i++) a.add(Integer.parseInt(reader.readLine()));
        int  maximum = a.get(0);
        int  minimum = a.get(0);

        for(int i=1;i<a.size();i++)
        {
            if(a.get(i)>maximum)
                maximum=a.get(i);
            if (a.get(i)<minimum)
                minimum=a.get(i);
        }

        //Вывести на экран максимальное и минимальное числа через пробел.
        System.out.println(maximum+ " "+ minimum);
    }
}