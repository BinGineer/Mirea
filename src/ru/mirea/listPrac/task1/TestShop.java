package ru.mirea.listPrac.task1;
import ru.mirea.listPrac.task1.Shop;

import java.util.Scanner;
public class TestShop {
    public static void main(String[] args){
        CommandInterface Interface = new CommandInterface();
        System.out.println("Магазин создан.");
        Scanner input = new Scanner(System.in);
        String Inter = "";
        ru.mirea.listPrac.task1.Shop Shop1 = new Shop();

        Interface.Commands();
        while (!Inter.equals("Exit")){
            Inter = input.nextLine();
            if (Inter.equals("add")){
                System.out.println("Введите модель компьютера:");
                String model = input.nextLine();
                System.out.println("Введите цвет компьютера:");
                String color = input.nextLine();
                System.out.println("Введите диагональ компьютера:");
                double diag = input.nextDouble();
                Shop1.addComp(model,color,diag);
            }
            else if (Inter.equals("del")) {
                System.out.println("Введите номер компьютера:");
                int number  = input.nextInt();
                Shop1.delComp(number);
            }
            else if(Inter.equals("change")){
                System.out.println("Введите номер компьютера: ");
                int numb = input.nextInt();
                input.nextLine();
                System.out.println("Введите модель компьютера:");
                String model = input.nextLine();
                System.out.println("Введите цвет компьютера:");
                String color = input.nextLine();
                System.out.println("Введите диагональ компьютера:");
                double diag = input.nextDouble();
                Shop1.ChangeAtributes(model,color,diag,numb);
            } else if (Inter.equals("read")) {
                System.out.println("Введите номер компьютера: ");
                int numb = input.nextInt();
                Shop1.getAtrBynumber(numb);

            } else if (Inter.equals("all")) {
                System.out.println("Все компьютеры в наличии:");
                Shop1.OutputAll();}
            else if (Inter.equals("help")){
                Interface.Commands();
            }
            else if (Inter.equals("clc")){
                Shop1.ClearAll();
                System.out.println("Удалено успешно");}
            else if (Inter.equals("isempty")){
                System.out.println(Shop1.IsEmpty());}
            else if (Inter.equals("Exit")) {
                return;
            }
            else {
                System.out.println("");
            }
        }


    }


}

