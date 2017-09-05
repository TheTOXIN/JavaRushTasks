package com.javarush.task.task01.lesson06.home01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* Добавление файла в архив
В метод main приходит список аргументов.
Первый аргумент - полный путь к файлу fileName.
Второй аргумент - путь к zip-архиву.
Добавить файл (fileName) внутрь архива в директорию 'new'.
Если в архиве есть файл с таким именем, то заменить его.

Пример входных данных:
C:/result.mp3
C:/pathToTest/test.zip

Файлы внутри test.zip:
a.txt
b.txt

После запуска Solution.main архив test.zip должен иметь такое содержимое:
new/result.mp3
a.txt
b.txt

Подсказка: нужно сначала куда-то сохранить содержимое всех энтри,
а потом записать в архив все энтри вместе с добавленным файлом.
Пользоваться файловой системой нельзя.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //String fileName = args[0];
        //String zipName = args[1];

        String fileName = "E:/tmp/test.txt";
        String zipName = "E:/tmp/1.zip";
        createTestZipFile(zipName);

        Map<ZipEntry, byte[]> data = new HashMap<>();
        ZipEntry entry;
        ZipInputStream inZip = new ZipInputStream(new FileInputStream(zipName));
        while ((entry = inZip.getNextEntry()) != null) {
            ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int count;
            while ((count = inZip.read(buf)) != -1) {
                byteArrayOutStream.write(buf, 0, count);
            }
            data.put(entry, byteArrayOutStream.toByteArray());
        }
        inZip.close();
        ZipOutputStream outZip = new ZipOutputStream(new FileOutputStream(zipName));
        for (Map.Entry<ZipEntry, byte[]> pair : data.entrySet()) {
            entry = new ZipEntry(pair.getKey());
            if (Paths.get(fileName).getFileName().equals(entry.getName()))
                continue;
            outZip.putNextEntry(entry);
            outZip.write(pair.getValue());
            outZip.closeEntry();
        }
        outZip.putNextEntry(new ZipEntry("new/" + Paths.get(fileName).getFileName().toString()));
        Files.copy(Paths.get(fileName), outZip);
        outZip.closeEntry();
        outZip.close();
    }

    private static void createTestZipFile(String zipFilePath) throws IOException {
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFilePath));

        zipOut.putNextEntry(new ZipEntry("a.txt"));
        zipOut.write("aaa".getBytes());
        zipOut.closeEntry();

        zipOut.putNextEntry(new ZipEntry("b.txt"));
        zipOut.write("bbb".getBytes());
        zipOut.closeEntry();

        zipOut.putNextEntry(new ZipEntry("c.txt"));
        zipOut.write("ccc".getBytes());
        zipOut.closeEntry();

        zipOut.close();
    }
}
