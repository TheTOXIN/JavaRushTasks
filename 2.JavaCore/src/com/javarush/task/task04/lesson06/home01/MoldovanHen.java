package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen
{
    int getCountOfEggsPerMonth()
    {
        return 98;
    }
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.MOLDOVA +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
