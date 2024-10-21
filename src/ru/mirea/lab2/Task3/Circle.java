package ru.mirea.lab2.Task3;

public class Circle {
    public Point pt = new Point(0,0);
    public double radius = 0;
    public Circle(Point pt, double radius){
        this.pt = pt;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getPt() {
        return pt;
    }

    public void setPt(Point pt) {
        this.pt = pt;
    }
}
