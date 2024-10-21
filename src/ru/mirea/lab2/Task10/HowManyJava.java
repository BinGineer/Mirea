package ru.mirea.lab2.Task10;

public class HowManyJava {
    public static void main(String[] args){
        int y = 0;
        for (String x: args){
            y+=1;
        }
        System.out.println(y);
    }
}
