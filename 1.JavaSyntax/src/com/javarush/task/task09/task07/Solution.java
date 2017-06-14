package com.javarush.task.task09.task07;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
