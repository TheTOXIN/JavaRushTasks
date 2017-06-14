package com.javarush.task.task08.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream in = new FileInputStream(name1);
        FileOutputStream out = new FileOutputStream(name2);

        byte[] bytes = new byte[in.available()];
        in.read(bytes);

        StringBuilder builder = new StringBuilder();
        String[] s = new String(bytes).split(" ");
        String res = "";

        for (int i = 0; i < s.length; i++) {
            long tmp = Math.round(Double.valueOf(s[i]));
            res = res + String.valueOf(tmp) + " ";
        }
        out.write(res.getBytes());

        in.close();
        out.close();
        reader.close();
    }
}
