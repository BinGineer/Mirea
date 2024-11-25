package ru.mirea.lab8.palindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        palind p = new palind();
        System.out.println(p.palindrom(word));
    }
}
