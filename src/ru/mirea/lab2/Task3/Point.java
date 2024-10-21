package ru.mirea.lab2.Task3;

public class Point {
    public double x;
    public double y;
    Point(){
        this.x = 0;
        this.y = 0;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(double x){
        this.x = x;
        this.y = 0;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y = y;
    }
}
