package ru.mirea.lab2.Task4;
import java.util.Scanner;
public class TestShop {
    public static void main(String[] args){
        CommandInterface Interface = new CommandInterface();
        System.out.println("Создание магазина.\nВведите максимальное количество компьютеров в магазине:");
        Scanner input = new Scanner(System.in);
        String Inter = "";
        int countComp = input.nextInt();
        Shop Shop1 = new Shop(countComp);

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
            else if (Inter.equals("diag")) {
                System.out.println("Введите диагональ компьютера:");
                double diag = Double.parseDouble(input.nextLine());
                Shop1.SearchByDiag(diag);
            }
            else if (Inter.equals("numb")) {
                System.out.println("Введите номер компьютера:");
                int numb = Integer.parseInt(input.nextLine());
                Shop1.SearchByNumb(numb);
            }
            else if (Inter.equals("color")) {
                System.out.println("Введите цвет компьютера:");
                String color = input.nextLine();
                Shop1.SearchByColor(color);}
            else if (Inter.equals("model")) {
                System.out.println("Введите модель компьютера:");
                String model = input.nextLine();
                Shop1.SearchByModel(model);}
            else if (Inter.equals("all")) {
                System.out.println("Все компьютеры в наличии:");
                Shop1.OutputAll();}
            else if (Inter.equals("help")){
                Interface.Commands();
            } else if (Inter.equals("Exit")) {
                return;
            }
            else {
                System.out.println("");
            }
        }


    }


}

