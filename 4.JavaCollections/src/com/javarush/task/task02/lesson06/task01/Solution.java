package com.javarush.task.task02.lesson06.task01;

import java.io.ByteArrayOutputStream;
import java.util.Random;


/* Генератор паролей
Реализуйте логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов
2) только цифры и латинские буквы разного регистра
3) обязательно должны присутствовать цифры, и буквы разного регистра
Все сгенерированные пароли должны быть уникальные.
Пример правильного пароля:
wMh7SmNu
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            char chr = ' ';
            switch ((int)(Math.random() * 3)) {
                case 0: chr = (char)((Math.random() * 10) + 48); break;
                case 1: chr = (char)((Math.random() * 36) + 65); break;
                case 2: chr = (char)((Math.random() * 26) + 97); break;
            }
            byteOut.write(chr);
        }
        return byteOut;
    }
}
