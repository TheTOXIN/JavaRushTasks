package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human G1father = new Human("Костя", true, 18, null, null);
        Human G1mother = new Human("Еборлова", false, 99, null, null);
        Human G2father = new Human("Юрий", true, 18, null, null);
        Human G2mother = new Human("Стив джобс", false, -0, null, null);
        Human father = new Human("Бутылочка",true, 4, G1mother, G1father);
        Human mother = new Human("Баклашка",false, 10000, G2mother, G2father);
        Human child1 = new Human("Долбоёб 1",false, 1, mother, father);
        Human child2 = new Human("Долбоёб 2",true, 1, mother, father);
        Human child3 = new Human("Долбоёб 3",false, 1, mother, father);
        System.out.println(G1father);
        System.out.println(G1mother);
        System.out.println(G2father);
        System.out.println(G2mother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        Human (String name, boolean sex, int age, Human mother, Human father)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
