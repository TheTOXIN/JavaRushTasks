package com.javarush.task.task06.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);

        int len = array.length;
        float med = len % 2 == 0 ? (float)(array[len / 2] + array[len / 2 - 1]) / 2 : array[len / 2];
        System.out.println("M = " + med);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                float res = Math.abs(o1 - med) - Math.abs(o2 - med);
                return (int)(res == 0 ? o1 - o2 : res);
            }
        });

        return array;
    }

    public static void main(String[] args) {
        Integer[] mass2 = {5,6,3,4,1,2,7,8,9,10,11};
        Integer[] mass3 = {2, 5, 6, 7, 21, 1};
        Integer[] mass4 = {5,2};
        Integer[] mass5 = {5,8,17,15,13,18};

        System.out.println("**************************");

        mass5 = Solution.sort(mass5);
        for (Integer integer : mass5)
        {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("**************************");

        mass4 = Solution.sort(mass4);

        for (Integer integer : mass4)
        {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("**************************");

        mass2 = Solution.sort(mass2);

        for (Integer integer : mass2)
        {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("**************************");


        mass3 = Solution.sort(mass3);
        for (Integer integer : mass3)
        {
            System.out.print(integer + " ");
        }

    }
}
