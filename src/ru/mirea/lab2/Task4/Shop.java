package ru.mirea.lab2.Task4;

public class Shop {
    int length, count;
    Computer [] computers = new Computer[count];
    public Shop(int count){
        this.count = count;
    }
    public void addComp(Computer comp){
        if (count < length){
        this.computers[count] = comp;
        count++;
        System.out.println("Успешно добавлено");
        }
        else {
            System.out.println("Хранилище переполнено");
        }
    }
    public void delComp(int number){
        int i = 0;
        do {
            if (computers[i].number == number){
                computers[i] = computers[count];
                this.count--;
                System.out.println("Удалено успешно");
                /*Этот метод присваивает значение типа Computer последнего элемента массива значению того элемента массива,
                которое требуется удалить, затем мы уменьшаем количество компьютеров, которое у нас есть на 1, таким образом, когда мы
                добавляем в массив новый объект, он заменит собой тот, который мы "продублировали" на место того объекта, который
                нам требовалось удалить.
                 */

            }
             i++;
        } while ((computers[i].number != number) || (i != this.count));
    }
    public void SearchByDiag(double diag){
        for (int i=0;i<=count;i++) {
            if (computers[i].diag == diag) {
                System.out.println(computers[i].toString());
            }
        }
    }
    public void SearchByColor(String color){
        for (int i=0;i<=count;i++) {
            if (computers[i].color == color) {
                System.out.println(computers[i].toString());
            }
        }
    }
    public void SearchByDiag(int number){
        int i = 0;
        do{
            if (computers[i].number == number){
                System.out.println(computers[i].toString());
            i++;
            }
        } while (computers[i].number != number);
    }
}
