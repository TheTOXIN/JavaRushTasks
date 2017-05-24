package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileReader in = new FileReader(name1);
        FileWriter out = new FileWriter(name2);
        while(in.ready()) {
            int data = in.read();
            if (data == 46)
                out.write(33);
            else
                out.write(data);
        }
        reader.close();
        in.close();
        out.close();
    }
}
