package com.javarush.task.task04.lesson02.home01;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    private String filed;

    public SelfInterfaceMarkerImpl() {
        this.filed = "FILED";
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public String getFiled() {
        return this.filed;
    }
}
