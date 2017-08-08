package com.javarush.task.task02.lesson09.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader in = new BufferedReader(new FileReader(fileName));
        List<String> sbList = new ArrayList<>();

        while (in.ready()) {
           sbList.addAll(Arrays.asList(in.readLine().split(" ")));
        }

        for (int i = 0; i < sbList.size(); i++) {
            for (int j = 0; j < sbList.size(); j++) {
                if (j != i && sbList.get(i).equals(new StringBuilder(sbList.get(j)).reverse().toString())) {

                    Pair pair = new Pair();
                    pair.first = sbList.get(i);
                    pair.second = sbList.get(j);
                    result.add(pair);

                    List<String> tmpList = new ArrayList<>();
                    tmpList.add(sbList.get(i));
                    tmpList.add(sbList.get(j));
                    sbList.removeAll(tmpList);

                    i--;
                    break;
                }
            }
        }
        System.out.println(result.toString());
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
