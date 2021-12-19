package com.geektech.myapplication;

public class Person {

    private int image;
    private String name;
    private int number;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person(int image, String name, int number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }
}
