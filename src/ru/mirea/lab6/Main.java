package ru.mirea.lab6;

public class Main {
    public static void main(String[] args){
        Movable m = new MovableCircle(1,1,1,1,5);
        m.moveright();
        m.movedown();
        System.out.println(m.toString())
        ;
    }
}
