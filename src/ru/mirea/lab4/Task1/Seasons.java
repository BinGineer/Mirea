package ru.mirea.lab4.Task1;

public class Seasons {
    public static void main(String[] args){
        for (Enums seas : Enums.values()){
            System.out.println(seas);
            seas.GetLove();
            seas.GetTemp();
            seas.GetDescription();
        }
    }
}
