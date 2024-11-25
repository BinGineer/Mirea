package ru.mirea.lab8.task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        task c = new task();
        int n = scan.nextInt();
        System.out.println(c.revers(n));
    }
}
