package com.javarush.task.task09.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while(fileReader.ready()) {
            String string = fileReader.readLine();
            char[] chars = string.toCharArray();
            int g = chars.length;
            for (int j = 0; j < g / 2; j++) {
                char tmp = chars[j];
                chars[j] = chars[g-j-1];
                chars[g-j-1] = tmp;
            }
            String str = String.valueOf(chars);
            System.out.println(str);
        }
        reader.close();
        fileReader.close();
    }
}
