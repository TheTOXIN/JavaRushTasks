package com.javarush.task.task01.lesson06.bonus01;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* Разархивируем файл
В метод main приходит список аргументов.
Первый аргумент - имя результирующего файла resultFileName, остальные аргументы - имена файлов fileNamePart.
Каждый файл (fileNamePart) - это кусочек zip архива. Нужно разархивировать целый файл, собрав его из кусочков.
Записать разархивированный файл в resultFileName.
Архив внутри может содержать файл большой длины, например, 50Mb.
Внутри архива может содержаться файл с любым именем.

Пример входных данных. Внутри архива находится один файл с именем abc.mp3:
C:/result.mp3
C:/pathToTest/test.zip.003
C:/pathToTest/test.zip.001
C:/pathToTest/test.zip.004
C:/pathToTest/test.zip.002
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultName = args[0];
        String[] parts = new String[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            parts[i-1] = args[i];
        }

        Arrays.sort(parts);

        for (int i = 0; i < parts.length; i++) {
            ZipInputStream inZip = new ZipInputStream(new FileInputStream(parts[i]));
            FileOutputStream outFile = new FileOutputStream(resultName);
            ByteArrayOutputStream buf = new ByteArrayOutputStream(1024);
            while (inZip.getNextEntry() != null) {
                int count;
                while ((count = inZip.read(buf.toByteArray())) != -1) {
                    outFile.write(buf.toByteArray(), 0, count);
                }
            }
            inZip.close();
            outFile.close();
        }
    }
}
