package com.javarush.task.task01.lesson08.home01;

public interface FileData {
    boolean isHidden();

    boolean isExecutable();

    boolean isDirectory();

    boolean isWritable();
}
