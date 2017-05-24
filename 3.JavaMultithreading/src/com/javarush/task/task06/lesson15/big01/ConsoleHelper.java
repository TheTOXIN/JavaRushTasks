package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String message = " ";
        try
        {
            message = " ";
            message = reader.readLine();
        }
        catch (IOException e) {

        }
        return message;
    }

    public static String askCurrencyCode() {
        String currencyCode = " ";

            writeMessage("Enter the currency code");
            while (true)
            {
                currencyCode = readString();
                if(currencyCode.length() != 3) {
                    writeMessage("Invalid code");
                }
                else {
                    break;
                }
            }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) {
        writeMessage("Enter the value and quantity of banknotes");
        String[] array;

        while (true)
        {
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try
            {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            }
            catch (Exception e)
            {
                writeMessage("invalid.data");
                continue;
            }
            if (k <= 0 || l <= 0 || array.length > 2)
            {
                writeMessage("invalid.data");
                continue;
            }
            break;
        }
        return array;
    }
}
