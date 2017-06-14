package com.javarush.task.task10.lesson10.bonus02;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {

        byte[][] b = new byte[a.length+1][a.length+1];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                b[i+1][j+1] = a[i][j];
            }
        }

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(b[i][j] == 1 && b[i-1][j-1] == 0 && b[i-1][j] == 0 && b[i][j-1] == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
