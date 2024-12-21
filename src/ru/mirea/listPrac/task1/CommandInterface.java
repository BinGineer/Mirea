package ru.mirea.listPrac.task1;

public class CommandInterface{
    public void Commands(){
        System.out.println("Команды интерфейса:\nadd - добавление компьютера\ndel -удаление компьютера по номеру\n" +
                "read - вывод информации о компьютере по номеру\nchange - изменение информации о компьютере по номеру " +
                "\nclc - очистка списка\nisempty - проверка на пустоту списка"+
                "\nall - вывод всех компьютеров, имеющихся в магазине\nhelp - вывод доступных команд" +
                "\nExit - завершение работы программы");
    }
}