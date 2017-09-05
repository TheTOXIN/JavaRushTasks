package com.javarush.task.task01.lesson10.home01;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

/* Читаем конфиги
Реализовать метод getProperties, который должен считывать свойства из переданного файла fileName.
fileName может иметь любое расширение - как xml, так и любое другое, или вообще не иметь.
Нужно обеспечить корректное чтение свойств.
При возникновении ошибок должен возвращаться пустой объект.
Метод main не участвует в тестировании.
Подсказка: возможно, Вам понадобится File.separator.
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("E:\\DEVELOPER\\JAVA\\JavaRush\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task01\\lesson10\\home01\\properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("E:\\DEVELOPER\\JAVA\\JavaRush\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task01\\lesson10\\home01\\properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("E:\\DEVELOPER\\JAVA\\JavaRush\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task01\\lesson10\\home01notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {
            FileInputStream in = new FileInputStream(fileName);
            String file = Paths.get(fileName).getFileName().toString();
            if (file.endsWith(".xml")) {
                properties.loadFromXML(in);
            } else if (file.matches(".*\\..*")) {
                properties.load(in);
            }
        } catch (IOException e) {
            return new Properties();
        }
        return properties;
    }
}
