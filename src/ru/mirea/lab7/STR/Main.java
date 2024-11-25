package ru.mirea.lab7.STR;

public class Main {
    public static void main(String[] args){
        Strings z = new StringCounter();
        System.out.println(z.counter("12345"));
        System.out.println(z.newStr("12345"));
        System.out.println(z.invertedStr("12345"));
    }
}