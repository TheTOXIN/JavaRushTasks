package com.javarush.task.task05.lesson09.task03;

import java.util.Stack;

/* Живем своим умом
В классе Solution реализуйте интерфейс UncaughtExceptionHandler, который должен:
1. прервать нить, которая бросила исключение.
2. вывести в консоль стек исключений начиная с самого вложенного.
Пример исключения: new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")))
Пример вывода:
java.lang.IllegalAccessException: GHI
java.lang.RuntimeException: DEF
java.lang.Exception: ABC
*/
public class Solution implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        Stack<Throwable> stack = new Stack<>();
        while (e != null) {
            stack.push(e);
            e = e.getCause();
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
                } catch (Exception e) {
                    getUncaughtExceptionHandler().uncaughtException(currentThread(), e);
                }
            }
        };
        t.setUncaughtExceptionHandler(new Solution());
        t.start();
    }
}
