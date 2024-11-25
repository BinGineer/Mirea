package ru.mirea.lab7.math;

public class Main {
    public static void main(String[] args){
        MathFunc math = new MathCalculable();
        System.out.println(math.getCircleLength(10));
        System.out.println(math.root(2));
        System.out.println(math.pow(7.7456,4));
        System.out.printf("%,.3f", math.complex(3,4));

    }
}
