package com.javarush.task.task02.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) {
        try {
            int countSpace = 0;
            for (char c : string.toCharArray()) {
                if (c == ' ')
                    countSpace ++;
            }
            if (countSpace < 4)
                throw new TooShortStringException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int firstIndex = 0;
        int lastIndex = 0;
        int count = 0;

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
                if (count == 1)
                    firstIndex = i + 1;
                if (count == 5)
                    lastIndex = i;
            }
            if (i == chars.length - 1 && count == 4)
                lastIndex = chars.length;
        }

        return string.substring(firstIndex, lastIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения"));
    }
}
