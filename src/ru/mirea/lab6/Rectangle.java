package ru.mirea.lab6;

class Rectangle implements Movable {
    MovablePoint point1;
    MovablePoint point2;
    Rectangle(int x1, int x2,int y1, int y2, int xspeed,int yspeed){
        this.point1 = new MovablePoint(x1,y1,xspeed,yspeed);
        this.point2 = new MovablePoint(x2,y2,xspeed,yspeed);
    }
    public void movedown() {
        point1.x -=1;
        point2.x -=1;
    }
    public void moveup() {
        point1.x +=1;
        point2.x +=1;
    }
    public void moveleft() {
        point1.y +=1;
        point2.y +=1;
    }
    public void moveright() {
        point1.y -=1;
        point2.y -=1;
    }
    @Override
    public String toString(){
        return (String) "x1: " + this.point1.x + ", y1: " + this.point1.y +
                ", x2: " + this.point2.x + ", y2: " + this.point2.y +
                ", xspeed: " + this.point1.xspeed + ", yspeed: " + this.point1.yspeed;
    }
}
