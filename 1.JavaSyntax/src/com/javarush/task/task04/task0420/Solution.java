package com.javarush.task.task04.task0420;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
        }

    }
}
