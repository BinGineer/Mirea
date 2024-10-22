package ru.mirea.lab2.Task4;

public class CommandInterface{
    public void Commands(){
        System.out.println("Команды интерфейса:\nadd - добавление компьютера\ndel -удаление компьютера по номеру\n" +
            "diag - поиск по диагонали\nnumb - поиск по номеру\ncolor - поиск по цвету" +
            "\nmodel - вывод всех компьютеров данной модели\nall - вывод всех компьютеров, имеющихся в магазине\nhelp - вывод доступных команд" +
            "\nExit - завершение работы программы");
    }
}
