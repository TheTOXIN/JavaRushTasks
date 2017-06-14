package com.javarush.task.task03.lesson06.task01;

/* Как выбрать нужное?
В методе main присвойте объекту Object obj экземпляр класса TEST
Константу TEST и класс TEST менять нельзя.
*/
public class Solution {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static String obj;

    public static void main(String[] args) {
        obj = Solution.TEST;
        System.out.println(obj);
    }
}
