package com.javarush.task.task05.lesson12.home02;

/* Тренировка мозга
Найти логическую ошибку: метод doAction в реализации интерфейса Movable должен выдавать "moving".
Исправьте ошибку, при необходимости измените (отрефакторите) интерфейс Movable.
Результат вывода в консоль должен быть:
flying
moving
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements Flyable, Movable {
        @Override
        public void doActionFly() {
            System.out.println("flying");
        }
        public void doActionMove() {
            System.out.println("moving");
        }
    }

    public static class Util {
        static void fly(Flyable animal) {
            animal.doActionFly();
        }

        static void move(Movable animal) {
            animal.doActionMove();
        }
    }

    public static interface Flyable {
        void doActionFly();
    }

    public static interface Movable {
        void doActionMove();
    }
}
