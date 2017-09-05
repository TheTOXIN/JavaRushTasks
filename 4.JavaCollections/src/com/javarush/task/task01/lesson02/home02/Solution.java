package com.javarush.task.task01.lesson02.home02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* Находим все файлы
Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используйте очередь, рекурсию не используйте.
Верните список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        for (String s : Solution.getFileTree("E:\\DEVELOPER\\JAVA\\JavaRush\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task01")) {
            System.out.println(s);
        }
    }

    public static List<String> getFileTree(String root) throws IOException {
        List<String> res = new ArrayList<>();
        File derictory = new File(root);
        Queue<File> queue = new LinkedList<>();

        queue.add(derictory);
        while (!queue.isEmpty()) {
            File file = queue.poll();
            for (File f : file.listFiles()) {
                if (f.isDirectory())
                    queue.add(f);
                else
                    res.add(f.getAbsolutePath());
            }
        }
        return res;
    }
}
