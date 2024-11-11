package ru.mirea.lab4.Task1;

public enum Enums {
    WINTER (-5),
    SPRING (10),
    SUMMER (20),
    AUTUMN (10);
    private final int SeasonTemp;
    private Enums(int Temp){
        this.SeasonTemp = Temp;
    }
    public void GetLove(){
        switch (this){
            case WINTER : System.out.println("I love Winter"); break;
            case SPRING: System.out.println("I love Spring"); break;
            case AUTUMN: System.out.println("I love Autumn"); break;
            case SUMMER: System.out.println("I love Summer");
        }
    }
    public void GetTemp(){
        System.out.println(this.SeasonTemp);
    }
    public void GetDescription(){
        if (this == SUMMER){
         System.out.println("Теплое время года");
        }
        else {
            System.out.println("Холодное время года");
        }
    }
}
