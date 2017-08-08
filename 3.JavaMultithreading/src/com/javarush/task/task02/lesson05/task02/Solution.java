package com.javarush.task.task02.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) {
        try {
            int countTab = 0;
            if (string == null)
                throw  new TooShortStringException();
            for (char c : string.toCharArray()) {
                if (c == '\t')
                    countTab ++;
            }
            if (countTab < 2)
                throw new TooShortStringException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int firstIndex = 0;
        int lastIndex = 0;
        int count = 0;

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\t') {
                count++;
                if (count == 1)
                    firstIndex = i + 1;
                if (count == 2)
                    lastIndex = i;
            }
        }

        return string.substring(firstIndex, lastIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
