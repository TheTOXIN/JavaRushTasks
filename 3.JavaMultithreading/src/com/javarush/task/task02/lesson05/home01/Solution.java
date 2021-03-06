package com.javarush.task.task02.lesson05.home01;

/* Нитиевые строки или строковые нити? Вот в чем вопрос.
1. Метод getPartOfString должен возвращать подстроку между первой и последней табуляцией.
2. На некорректные данные getPartOfString должен бросить исключение:
а) TooShortStringFirstThreadException, если имя трэда FIRST_THREAD_NAME.
б) TooShortStringSecondThreadException, если имя трэда SECOND_THREAD_NAME.
в) RuntimeException в других случаях.
3. Реализуйте логику трех protected методов в
ThisUncaughtExceptionHandler используя вызовы соответствующих методов согласно следующему шаблону:
a) 1# : TooShortStringFirstThreadException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
б) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : TooShortStringSecondThreadException : 2#
в) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#
*/
public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new ThisUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public String getPartOfString(String string, String threadName) {
        int countTab = 0;
        try {
            if (string == null) {
                if (threadName.equals(FIRST_THREAD_NAME))
                    throw new TooShortStringFirstThreadException();
                else if (threadName.equals(SECOND_THREAD_NAME))
                    throw new TooShortStringFirstThreadException();
                else
                    throw new RuntimeException();
            }
            for (char c : string.toCharArray()) {
                if (c == '\t')
                    countTab ++;
            }
            if (countTab < 2) {
                if (threadName.equals(FIRST_THREAD_NAME))
                    throw new TooShortStringFirstThreadException();
                else if (threadName.equals(SECOND_THREAD_NAME))
                    throw new TooShortStringFirstThreadException();
                else
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int firstIndex = 0;
        int lastIndex = 0;
        int count = 0;

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\t') {
                count++;
                if (count == 1)
                    firstIndex = i + 1;
                if (count == countTab)
                    lastIndex = i;
            }
        }

        return string.substring(firstIndex, lastIndex);
    }
}
