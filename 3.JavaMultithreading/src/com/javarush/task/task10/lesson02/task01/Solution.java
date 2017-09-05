package com.javarush.task.task10.lesson02.task01;

/* Осваиваем методы класса Integer
Используя метод Integer.parseInt(String, int) реализуйте логику метода convertToDecimalSystem,
который должен переводить переданную строку в десятичное число и возвращать его в виде строки.
*/
public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        int radix;
        String res = "";
        if (s.matches("0x\\d*")) {
            res = s.replaceFirst("0x", "");
            radix = 16;
        } else if (s.matches("0\\d*")) {
            res = s.replaceAll("0", "");
            radix = 8;
        } else if (s.matches("0b\\d*")) {
            res = s.replaceAll("0b", "");
            radix = 2;
        } else {
            res = s;
            radix = 10;
        }
        return res;
    }
}
