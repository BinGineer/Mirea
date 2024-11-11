package ru.mirea.lab4.Task4_1;

public class Shape {
    String type;
    public Shape(String s){
        this.type=s;
    }
    public void getType(){
        System.out.println(this.type);
    }
}
class Circle extends Shape{
    public int radius;
    public Circle(int i){
        super("Circle");
        this.radius = i;
    }
    public int GetArea(){
        return (int) (this.radius*this.radius*3.14);
    }
    public int GetPerimeter(){
        return (int) (2*3.14*radius);
    }
    public void ToString() {
        System.out.println("Type: " + type+ "\nRad:" + radius + "\nPerim: " + this.GetPerimeter()+ "\nArea: "+ this.GetArea());
    }
}
class Square extends Shape{
    int a;
    public Square(int i){
        super("Square");
        this.a = i;
    }
    public int GetArea(){
        return (int) (this.a*this.a);
    }
    public int GetPerimeter(){
        return (int) (this.a*4);
    }
    public void ToString() {
        System.out.println("Type: " + type+ "\nStor:" + a + "\nPerim: " + this.GetPerimeter()+ "\nArea: "+ this.GetArea());
    }
}
class Rectangle extends Shape{
    int a;
    public Rectangle(int i){
        super("Rectangle");
        this.a = i;
    }
    public int GetArea(){
        return (int) (this.a*Math.pow(3,0.5)/4);
    }
    public int GetPerimeter(){
        return (int) (this.a*3);
    }
    public void ToString() {
        System.out.println("Type: " + type+ "\nStor:" + a + "\nPerim: " + this.GetPerimeter()+ "\nArea: "+ this.GetArea());
    }
}
