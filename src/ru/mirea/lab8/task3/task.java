package ru.mirea.lab8.task3;

public class task {
    public int countofdec(int i){
        if (i/10 == 0){
            return 1;
        }
        return countofdec(i/10) +1;
    }
    public int revers( int n){
        int z = countofdec(n)-1;
        if (z==0){
            return n;
        }
        return n%10*(int)Math.pow(10,z)+revers(n/10);
    }
}
