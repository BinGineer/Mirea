package ru.mirea.lab3;

import java.util.Random;

public class Sequence {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i<4;i++){
            arr[i] = rand.nextInt(10,100);
        }
        String out1 = "arr: [";
        for (int i = 0;i<4;i++){
            out1 += arr[i] + ", ";
        }
        out1 = out1.substring(0,out1.length()-2);
        out1 += "]";
        System.out.println(out1);
        boolean flag = true;
        int i = 1;
        while ((flag) & (i<4)){
            if (arr[i]<arr[i-1]){
                flag = false;

            }
            i++;
        }
        System.out.println(flag);
    }
}
