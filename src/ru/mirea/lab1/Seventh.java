package ru.mirea.lab1;
import java.util.Scanner;
public class Seventh {
    public static void main(String[] ay){
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите число: ");
    int i = scan.nextInt();
    System.out.println("Факториал равен " + fact(i));
    }
    public static int fact(int k){
        int z = 1;
        for (int i = k; i>0; i--){
            z *=i;
        }
        return z;
    }
}
