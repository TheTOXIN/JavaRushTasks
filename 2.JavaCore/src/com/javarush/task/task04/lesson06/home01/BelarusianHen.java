package com.javarush.task.task04.lesson06.home01;

public class BelarusianHen extends Hen
{
    int getCountOfEggsPerMonth()
    {
        return 97;
    }
    String getDescription()
    {
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
