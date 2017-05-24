package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream(args[0]);
        HashMap<Byte,Integer> maps = new HashMap<>();
        byte[] buffer = new byte[in.available()];
        in.read(buffer);
        in.close();

        for (int i = 0; i < buffer.length - 1; i++) {
            for (int j = i + 1; j < buffer.length; j++) {
                if (buffer[i] > buffer[j]) {
                    byte tmp = buffer[i];
                    buffer[i] = buffer[j];
                    buffer[j] = tmp;
                }
            }
        }

        int count;
        for (byte x : buffer) {
            count = 0;
            for (byte y : buffer) {
                if (x == y) {
                    count++;
                }
            }
            if (!maps.containsKey(x)) {
                maps.put(x,count);
                System.out.println((char) x + " " + count);
            }
        }
    }
}
