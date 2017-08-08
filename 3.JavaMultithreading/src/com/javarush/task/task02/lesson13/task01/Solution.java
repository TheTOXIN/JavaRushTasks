package com.javarush.task.task02.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String[] getTokens(String query, String delimiter) {
        if (query == null || delimiter == null)
            return null;

        StringTokenizer tokens = new StringTokenizer(query, delimiter);
        String[] strings = new String[tokens.countTokens()];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = tokens.nextToken();
        }

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = getTokens("level22.lesson13.task01", ".");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
