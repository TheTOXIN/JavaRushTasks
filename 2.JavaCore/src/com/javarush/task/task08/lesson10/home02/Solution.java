package com.javarush.task.task08.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int countSpace = 0;
        int countChar = 0;
        FileInputStream in = new FileInputStream(args[0]);
        while (in.available() > 0) {
            countChar++;
            if (in.read() == ' ')
                countSpace++;
        }
        float res = (float) ((float) countSpace/countChar*100.0);
        System.out.printf("%.2f", res);
        in.close();
    }
}
