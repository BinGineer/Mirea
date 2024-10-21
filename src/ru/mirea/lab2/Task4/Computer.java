package ru.mirea.lab2.Task4;

public class Computer {
    public String model, color;
    public int number;
    public double diag;
    public Computer(){
        this.model = "None";
        this.color = "None";
        this.number = 0;
        this.diag = 0;
    }
    public Computer(String model, String color, int number, double diag) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.diag = diag;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                ", diag=" + diag +
                '}';
    }
}
