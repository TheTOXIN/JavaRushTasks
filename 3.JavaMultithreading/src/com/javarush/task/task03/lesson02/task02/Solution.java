package com.javarush.task.task03.lesson02.task02;

/* Запретите переопределение
Запретите переопределение метода onMouseDown.
*/
public class Solution {

    public static class Listener {
        public void onMouseDown(int x, int y) {
            //do something on mouse down event
        }

        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }
    }
}
