package com.javarush.task.task06.home0605;

/* Есть новые идеи? Подумаем...
1. В классе Solution создать public статический класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создайте статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }

    public static class  Idea
    {
        public String getDescription()
        {
            return  "DRATUTI";
        }
    }

    public static void printIdea(Idea idea)
    {
        String s =idea.getDescription();
        System.out.println(s);
    }
}
