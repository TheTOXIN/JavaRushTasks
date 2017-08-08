package com.javarush.task.task02.lesson13.task02;

import java.io.*;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("text_1.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("text_2.txt"));

        while (in.ready()) {
            String s = in.readLine();
            out.write(new String(s.getBytes("Windows-1251")));
        }

        in.close();
        out.close();
    }
}
