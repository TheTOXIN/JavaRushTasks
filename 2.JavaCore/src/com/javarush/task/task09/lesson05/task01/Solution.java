package com.javarush.task.task09.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileReader in = new FileReader(name1);
        FileWriter out = new FileWriter(name2);
        int i = 0;
        while(in.ready()) {
            i++;
            int data = in.read();
            if (i % 2 == 0) {
                out.write(data);
            }
        }
        in.close();
        out.close();
        reader.close();
    }
}
