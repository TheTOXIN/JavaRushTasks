package com.javarush.task.task30.task3012;

/* 
Получи заданное число
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(3001);
    }

    public void createExpression(int number) {
        //напишите тут ваш код

        String res = "";
        int sum = 0;
        int[] masNum = {1, 3, 9, 27, 81, 243, 729, 2187};
        int[] mask = new int[masNum.length];

        while (sum != number) {
            sum = 0;
            res = "";
            for (int i = 0; i < mask.length; i++) {
                mask[i] = (int)(Math.random() * 3) - 1;
                if (mask[i] > 0) {
                    res += " + " + masNum[i];
                    sum += +masNum[i];
                }
                else if (mask[i] < 0) {
                    res += " - " + masNum[i];
                    sum += -masNum[i];
                }
            }
            sum = Math.abs(sum);
        }

        System.out.println(sum + " = " + res.trim());
    }
}