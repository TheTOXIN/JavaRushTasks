package com.javarush.task.task08.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e")) {
            FileInputStream in = new FileInputStream(args[1]);
            FileOutputStream out = new FileOutputStream(args[2]);
            byte[] secret = new byte[in.available()];
            int count = in.read(secret);
            for (int i = 0; i < secret.length; i++) {
                secret[i]++;
            }
            out.write(secret);
            in.close();
            out.close();
        } else if (args[0].equals("-d")) {
            FileInputStream in = new FileInputStream(args[1]);
            FileOutputStream out = new FileOutputStream(args[2]);
            byte[] secret = new byte[in.available()];
            int count = in.read(secret);
            for (int i = 0; i < secret.length; i++) {
                secret[i]--;
            }
            out.write(secret);
            in.close();
            out.close();
        }
    }
}
