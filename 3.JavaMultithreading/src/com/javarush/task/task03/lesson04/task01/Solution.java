package com.javarush.task.task03.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution s1 = new Solution();
        Solution s2 = new Solution();

        InnerClass in1 = s1.new InnerClass();
        InnerClass in2 = s2.new InnerClass();
        InnerClass in3 = s2.new InnerClass();
        InnerClass in4 = s2.new InnerClass();

        s1.innerClasses[0] = in1;
        s1.innerClasses[1] = in2;

        s2.innerClasses[0] = in3;
        s2.innerClasses[1] = in4;

        Solution[] res = new Solution[2];

        res[0] = s1;
        res[1] = s2;

        return res;
    }
}
