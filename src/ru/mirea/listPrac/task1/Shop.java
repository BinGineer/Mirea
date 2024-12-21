package ru.mirea.listPrac.task1;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public int count = 0;
    public int number = 1;
    ArrayList<Computer> computers;
    public void createempty(){
        this.computers = new ArrayList<>();
    }
    public Shop(){
        createempty();
    }
    public void addComp(String model, String color, double diag){
            Computer added = new Computer(model,color,number,diag);
            this.computers.add(added);
            count++;
            number +=1;
            System.out.println(computers.size());
            System.out.println("Успешно добавлено");
        }

    public void delComp(int number){
        this.computers.remove(number-1);
    }
    public void getAtrBynumber(int number) {
            computers.get(number-1).GetAtributes();
        }
    public boolean IsEmpty(){
        if (this.computers.isEmpty()){
            return true;
        }
        return false;
    }
    public void ChangeAtributes(String model,String color, double diag,int number){
        Computer added = new Computer(model,color,number,diag);
        this.computers.get(number).ReadAtributes(model,color,diag);
    }
    public void OutputAll(){
        if (this.IsEmpty()){
            System.out.println("Магазин пуст");
            return;
        }
        else {
            for (int i = 0;i<computers.size();i++){
                computers.get(i).GetAtributes();
            }
            return;
        }
    }

    public void ClearAll(){
        this.computers.clear();
    }
}