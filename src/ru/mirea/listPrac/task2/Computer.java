package ru.mirea.listPrac.task2;

public class Computer {
    public String model, color;
    int number;
    public double diag;

    public Computer(String model, String color, int number, double diag) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.diag = diag;
    }

    public void ReadAtributes(String model,String color, double diag){
        this.model = model;
        this.color = color;
        this.diag = diag;
    }
    public void GetAtributes(){
        System.out.println("Модель: " + this.model);
        System.out.println("Цвет: " + this.color);
        System.out.println("Номер: " + this.number);
        System.out.println("Диагональ: " + this.diag);
    }


}