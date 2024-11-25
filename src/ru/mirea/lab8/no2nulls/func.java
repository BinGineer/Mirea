package ru.mirea.lab8.no2nulls;

public class func {
//    int a, b;
    public int fact(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return fact(n-1)*n;
    }
    public int z(int a, int b) {
        if (a - b > 1) {
            return 0;
        }
        return (fact(b+1))/(fact(b+1-a)*fact(a));
    }
}