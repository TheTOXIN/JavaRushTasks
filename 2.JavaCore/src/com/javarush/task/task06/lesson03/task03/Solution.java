package com.javarush.task.task06.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        list.add(new Thread(specialThread));
        list.add(new Thread(specialThread));
        list.add(new Thread(specialThread));
        list.add(new Thread(specialThread));
        list.add(new Thread(specialThread));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
