package com.javarush.task.task08.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileInputStream in2 = new FileInputStream(name2);
        FileInputStream in1 = new FileInputStream(name1);

        byte[] bytes1 = new byte[in1.available()];
        in1.read(bytes1);
        in1.close();

        byte[] bytes2 = new byte[in2.available()];
        in2.read(bytes2);
        in2.close();

        FileOutputStream out1 = new FileOutputStream(name1);
        out1.write(bytes2);
        out1.close();

        FileOutputStream out2 = new FileOutputStream(name1, true);
        out2.write(bytes1);
        out2.close();
    }
}
