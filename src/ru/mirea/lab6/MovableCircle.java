package ru.mirea.lab6;

class MovableCircle implements Movable{
    int radius;
    MovablePoint center;
    MovableCircle(int x,int y, int xspeed,int yspeed,int radius){
        this.center = new MovablePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }
    public void moveup(){
        this.center.y+=1;
    }
    public void movedown(){
        this.center.y-=1;
    }
    public void moveleft(){
        this.center.x-=1;
    }
    public void moveright(){
        this.center.x +=1;
    }
    @Override
    public String toString(){
        return (String) "x: " + this.center.x + ", y: " + this.center.y + ", xspeed: " +
                this.center.xspeed + ", yspeed: " + this.center.yspeed+ ", radius: " + this.radius;
    }
}
