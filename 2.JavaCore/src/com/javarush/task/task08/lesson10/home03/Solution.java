package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = " ";
        String name2 = " ";
        String name3 = " ";

        name1 = reader.readLine();
        name2 = reader.readLine();
        name3 = reader.readLine();

        FileInputStream in2 = new FileInputStream(name2);
        FileInputStream in3 = new FileInputStream(name3);
        FileOutputStream out = new FileOutputStream(name1);

        byte[] bytes2 = new byte[in2.available()];
        byte[] bytes3 = new byte[in3.available()];

        in2.read(bytes2);
        in3.read(bytes3);

        out.write(bytes2);
        out.write(bytes3);

        out.close();
        in2.close();
        in3.close();
        reader.close();
    }
}
