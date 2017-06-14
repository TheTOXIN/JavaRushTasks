package com.javarush.task.task05.lesson12.bonus02;

public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink() {

        getRightCup();
        putIngredient();
        pour();
    }
}
