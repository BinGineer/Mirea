package ru.mirea.listPrac.task2;

public class Shop {
    public int count = 0;
    public int number = 1;
    CircularLinkedList computers;
    public void createempty(){
        this.computers = new CircularLinkedList();
    }
    public Shop(){
        createempty();
    }
    public void addComp(String model, String color, double diag){
            Computer added = new Computer(model,color,number,diag);
            this.computers.addNode(added);
            count++;
            number +=1;
            System.out.println(computers.GetLen());
            System.out.println("Успешно добавлено");
        }

    public void delComp(int number){
        this.computers.deleteNode(this.computers.getObjectByNumder(number));
    }
    public void getAtrBynumber(int number) {
            computers.readNodeByNumber(number);
        }
    public boolean IsEmpty(){
        return this.computers.isEmpty();
    }
    public void ChangeAtributes(String model,String color, double diag,int number){

        computers.getObjectByNumder(number).ReadAtributes(model,color,diag);
        this.computers.readNodeByNumber(number);
    }
    public void OutputAll(){
        if (this.IsEmpty()){
            System.out.println("Магазин пуст");

        }
        else {
            this.computers.AlltoList();
        }
    }

    public void ClearAll(){
        createempty();
    }
}