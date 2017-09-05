package com.javarush.task.task01.lesson02.home01;

import java.io.*;
import java.util.*;

/* Проход по дереву файлов
1. На вход метода main подаются два параметра.
Первый - path - путь к директории, второй - resultFileAbsolutePath - имя файла, который будет содержать результат.
2. Для каждого файла в директории path и в ее всех вложенных поддиректориях выполнить следующее:
2.1. Если у файла длина в байтах больше 50, то удалить его.
2.2. Если у файла длина в байтах НЕ больше 50, то для всех таких файлов:
2.2.1. отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке
2.2.2. переименовать resultFileAbsolutePath в 'allFilesContent.txt'
2.2.3. в allFilesContent.txt последовательно записать содержимое всех файлов из п. 2.2.1. Тела файлов разделять "\n"
2.3. Удалить директории без файлов (пустые).
Все файлы имеют расширение txt.
*/
public class Solution {
    public static void main(String[] args) {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);

        List<File> files = new ArrayList<>();
        File[] fileMas = path.listFiles();

        int i = 0;
        for (File file : fileMas) {
            if ((file.isFile() && (file.length() > 50 || file.length() == 0)) || file.isDirectory() && file.length() == 0) {
                file.delete();
            }
            else {
                files.add(file);
            }
            i++;
        }

        Comparator<File> fc = new Comparator<File>(){
            @Override public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(files, fc);

        resultFileAbsolutePath.renameTo(new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt"));
        try {
        OutputStream out = new FileOutputStream(resultFileAbsolutePath);
        InputStream in = null;
            for (File file : files) {
                in = new FileInputStream(file);
                while (in.available() > 0) {
                    out.write(in.read());
                }
                out.write('\n');
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
