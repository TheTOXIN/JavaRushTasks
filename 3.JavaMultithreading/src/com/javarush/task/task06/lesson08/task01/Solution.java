package com.javarush.task.task06.lesson08.task01;

/* Вежливость - это искусственно созданное хорошее настроение.
В классе Solution создайте public static класс IntegerHolder.
IntegerHolder должен быть для типа int, быть нитебезопасным и изменяемым.
В этом классе должны быть два public метода get и set
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static class IntegerHolder {
        private volatile int value;

        public IntegerHolder(int value) {
            this.value = value;
        }

        public synchronized int get() {
            return this.value;
        }

        public synchronized void set(int value) {
            this.value = value;
        }
    }
}
