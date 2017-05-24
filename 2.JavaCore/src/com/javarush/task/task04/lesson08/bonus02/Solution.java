package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());

        System.out.println(NOD(n1,n2));

    }

    public static int NOD(int n1, int n2)
    {
        boolean n1Del = false;
        boolean n2Del = false;
        int i;

        if (n1 >= n2)
            i = n1;
        else
            i = n2;

        do
        {
            i--;
            n1Del = (double)n1 % i == 0;
            n2Del = (double)n2 % i == 0;
        }
        while((n1Del && n2Del)==false);

        return i;
    }
}
