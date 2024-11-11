package ru.mirea.lab6;

class MovablePoint implements Movable{
    int x,y,xspeed,yspeed;
    MovablePoint(int x, int y, int xspeed,int yspeed){
        this.x=x;
        this.y=y;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public void moveup(){
        this.y+=1;
    }
    public void movedown(){
        this.y-=1;
    }
    public void moveleft(){
        this.x-=1;
    }
    public void moveright(){
        this.x +=1;
    }
    @Override
    public String toString(){
        return (String) "x: " + this.x + ", y: " + this.y + "xspeed: " + this.xspeed + ", yspeed: " + this.yspeed;
    }
}
