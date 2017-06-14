package com.javarush.task.task10.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private boolean color;
        private String home;
        private String city;

        Human(String name)
        {
            this.name = name;
        }
        Human(int age)
        {
            this.age = age;
        }
        Human(boolean sex)
        {
            this.sex = sex;
        }
        Human(String home, boolean sex)
        {
            this.home = home;
            this.sex = sex;
        }
        Human(String home, String city)
        {
            this.home = home;
            this.city = city;
        }
        Human(String city, int age)
        {
            this.city = city;
            this.age = age;
        }
        Human(int age, boolean sex)
        {
            this.age = age;
            this.sex = sex;
        }
        Human(String name, boolean color, int age)
        {
            this.age = age;
            this.name = name;
            this.color = color;
        }
        Human(String name, String city, String home)
        {
            this.name = name;
            this.city = city;
            this.home = home;
        }
        Human(int age, boolean sex, String home)
        {
            this.age = age;
            this.sex = sex;
            this.home = home;
        }
    }
}
