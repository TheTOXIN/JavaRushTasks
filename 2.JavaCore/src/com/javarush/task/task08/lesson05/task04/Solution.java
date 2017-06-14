package com.javarush.task.task08.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream in = new FileInputStream(name1);
        FileOutputStream out = new FileOutputStream(name2);
        byte[] res = new byte[in.available()];

        while (in.available() > 0) {
            int count = in.read(res);

            for(int i = 0; i < res.length / 2; i++){
                byte tmp = res[i];
                res[i] = res[res.length-i-1];
                res[res.length-i-1] = tmp;
            }
            out.write(res, 0 , count);
        }
        reader.close();
        in.close();
        out.close();
    }
}
