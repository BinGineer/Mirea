package ru.mirea.lab1;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину:");
        int length = input.nextInt();
        int x = 0;
        System.out.println("Введите числа массива:");
        int [] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = input.nextInt();
        }
        for (int i = 0; i < length; i++){
            x += array[i];
        }
        float z = x/length;
        System.out.println("Сумма элементов массива: " + x);
        System.out.println("Среднее арифметическое элементов массива: " + z);
    }
}
