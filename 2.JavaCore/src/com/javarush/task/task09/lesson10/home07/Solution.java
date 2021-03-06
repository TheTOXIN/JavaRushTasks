package com.javarush.task.task09.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBulder = new StringBuilder();

        while(reader.ready()){
            String string = reader.readLine();
            String[] words = string.split(" ");
            for(String word : words) {
                if(word.length() > 6) {
                    stringBulder.append(word + ",");
                }
            }
        }
        stringBulder.deleteCharAt(stringBulder.length() - 1);
        writer.write(stringBulder.toString());
        reader.close();
        writer.close();
    }
}
