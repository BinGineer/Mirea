package ru.mirea.lab2.Task4;

public class Shop {
    private int length;
    public int count = 0;
    public int number = 1;
    public Computer[] computers;

    public Shop(int length){
        this.length = length;
        this.computers = new Computer[length];
    }

    public void addComp(String model, String color, double diag){
        if (count < length) {
        this.computers[count] = new Computer(model, color, number, diag);
        count++;
        number +=1;
        System.out.println("Успешно добавлено");
        }
        else {
            System.out.println("Хранилище переполнено");
        }
    }
    public void delComp(int number){
        int i = 0;
        while (i<count){
            if (computers[i].number == number){
                computers[i] = computers[count-1];
                this.count--;
                System.out.println("Удалено успешно");
                /*Этот метод присваивает значение типа Computer последнего элемента массива значению того элемента массива,
                которое требуется удалить, затем мы уменьшаем количество компьютеров, которое у нас есть на 1, таким образом, когда мы
                добавляем в массив новый объект, он заменит собой тот, который мы "продублировали" на место того объекта, который
                нам требовалось удалить.
                 */
                return;
            }
             i++;
        }
    }
    public void SearchByDiag(double diag){
        boolean flag = false;
        for (int i=0;i<count;i++) {
            if ((computers[i].diag == diag) ){
                System.out.println(computers[i].toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Компьютера с такой диагональю нет");
        }
    }
    public void SearchByColor(String color){
        boolean flag = false;
        for (int i=0;i<count;i++) {
            if (computers[i].color.equals(color)) {
                System.out.println(computers[i].toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Компьютера с таким цветом нет");
        }
    }
    public void SearchByNumb(int number){
        int i = 0;
        while (i<count){
            if (computers[i].number == number){
                System.out.println("Компьютер с номером " + number + ":");
                System.out.println(computers[i].toString());
                return;

            }
            i++;
        }
        System.out.println("Компьютера с таким номером нет");
    }
    public void SearchByModel(String model){
        boolean flag = false;
        int i = 0;
        while (i<count){
            if (computers[i].model.equals(model)){
                System.out.println(computers[i]);
                flag = true;

            }
            i++;
        }
        if (!flag){
            System.out.println("Компьютера с такой моделью нет");
        }
    }
    public void OutputAll(){
        boolean flag = false;
        for (int i = 0; i<count;i++){
            System.out.println(computers[i]);
            flag = true;
        }
        if (!flag){
            System.out.println("Магазин пуст");
        }
    }
}
