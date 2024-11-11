package ru.mirea.lab3;
import java.util.*;
public class Task1 {
    public static void main(String[] args){
        Random rand = new Random();
        int len2 = rand.nextInt(1,10);
        int len1 = rand.nextInt(1,10);
        double[] arr1 = new double[len1];
        double[] arr2 = new double[len2];
        for(int i = 0;i<len1;i++){
            arr1[i] = Math.random()*100;
        }
        for (int i = 0;i<len2; i++){
            arr2[i] = rand.nextDouble(10);
        }
        String out1 = "arr1: [";
        for (int i = 0;i<len1;i++){
            out1 += arr1[i] + ", ";
        }
        out1 = out1.substring(0,out1.length()-2);
        out1 += "]";
        System.out.println(out1);
        out1 = "arr2: [";
        for (int i = 0;i<len2;i++){
            out1 += arr2[i] + ", ";
        }
        out1 = out1.substring(0,out1.length()-2);
        out1 += "]";
        System.out.print(out1);

    }
}
