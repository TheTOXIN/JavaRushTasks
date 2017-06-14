package com.javarush.task.task05.task0508;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name = null;
    private int height;
    private String colour = null;


    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name,int height){
        this.name = name;
        this.height = height;
    }

    public void initialize(String name,int height,String colour){
        this.name = name;
        this.height = height;
        this.colour = colour;
    }

}
