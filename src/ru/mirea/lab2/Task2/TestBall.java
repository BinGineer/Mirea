package ru.mirea.lab2.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1,5);
        System.out.println(ball1.toString());
        ball1.setX(3);
        System.out.println(ball1.getX());
        ball1.move(2.7, 3.7);
        System.out.println("x: " + ball1.getX());
        System.out.println("y: " + ball1.getY());
        ball1.setXY(0,0);
        System.out.println(ball1.toString());
    }
}
