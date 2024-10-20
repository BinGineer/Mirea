package ru.mirea.lab1;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Заполнение циклом \"For\"");
        System.out.println("Введите длину: ");
        int length = input.nextInt();
        int x=0,z = 0;
        int [] array = new int[length];
        System.out.println("Введите массив: ");
        for(int i = 0; i < length; i++){
            array[i] = input.nextInt();
        }
        int minv = array[0],maxv = array[0];

        while (z<length) {
            x += array[z];
            if (array[z]<minv){
                minv = array[z];
            }
            if (array[z]>maxv){
                maxv = array[z];
            }
            z++;
        }
        float k = (float)x/length;
        System.out.println("Сумма элементов массива: " + x);
        System.out.println("Среднее арифметическое элементов массива: " + k);
        System.out.println("Минимальное значение массива: " + minv);
        System.out.println("Максимальное значение массива: " + maxv);

        System.out.println("Заполнение циклом \"do while\"");
        System.out.println("Введите длину:");
        length = input.nextInt();
        minv = maxv = x = z = 0;
        System.out.println("Введите массив:");
        int [] arr = new int[length];
        for (int i=0;i < length;i++){
            arr[i] = input.nextInt();
        }
        minv = maxv = arr[0];
        do {
            x += arr[z];
            if (arr[z]<minv){
                minv = arr[z];
            }
            if (arr[z]>maxv){
                maxv = arr[z];
            }
            z++;
        } while (z<length);
        System.out.println("Сумма элементов массива: " + x);
        k = (float)x/length;
        System.out.println("Среднее арифметическое элементов массива: " + k);
        System.out.println("Минимальное значение массива: " + minv);
        System.out.println("Максимальное значение массива: " + maxv);

    }
}