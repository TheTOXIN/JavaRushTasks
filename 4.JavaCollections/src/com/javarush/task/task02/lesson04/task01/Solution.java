package com.javarush.task.task02.lesson04.task01;

import java.io.PrintWriter;
import java.io.StringWriter;

/* Пишем стек-трейс
Реализуйте логику метода getStackTrace, который в виде одной строки должен возвращать весь стек-трейс переданного исключения.
Используйте подходящий метод класса Throwable, который поможет записать стек-трейс в StringWriter.
*/
public class Solution {
    public static void main(String[] args) {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) {
        StringWriter writer = new StringWriter();
        throwable.printStackTrace(new PrintWriter(writer));
        return writer.toString();
    }
}
