package com.javarush.task.task09.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Date d = new Date(r.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y");
        System.out.println(simpleDateFormat.format(d).toUpperCase());
    }
}
