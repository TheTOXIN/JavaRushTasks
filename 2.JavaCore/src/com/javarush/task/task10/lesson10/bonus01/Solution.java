package com.javarush.test.level20.lesson10.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {
    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        int n = 21474672;
        int[] numbers = getNumbers(n);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }
    public static int[] getNumbers(int N) {
        int[] result = null;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int M = 0;
            double sum = 0;
            int tmp1 = i;
            int tmp2 = i;
            int n = 0;

            do {
                tmp1 = tmp1 / 10;
                M++;
            } while (tmp1 != 0);

            do {
                n = tmp2 % 10;
                tmp2 = tmp2 / 10;
                sum = sum + Math.pow((double)n, (double)M);
            } while(tmp2 != 0);

            if (sum == i) {
                list.add(i);
            }
        }
        result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}