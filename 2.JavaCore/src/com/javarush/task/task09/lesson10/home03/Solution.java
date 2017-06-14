package com.javarush.task.task09.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader(args[0]));
        String str;
        while ((str = fileIn.readLine()) != null) {
            String[] bstr = str.replace("\n", "").split(" ");

            int year = Integer.parseInt(bstr[bstr.length - 1]);
            int month = Integer.parseInt(bstr[bstr.length - 2]);
            int day = Integer.parseInt(bstr[bstr.length - 3]);
            Date birthday = new GregorianCalendar(year, month - 1, day).getTime();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bstr.length - 3; i++) {
                sb.append(bstr[i]);
                sb.append(" ");
            }
            PEOPLE.add(new Person(sb.toString().trim(), birthday));
        }
        fileIn.close();
    }

}
