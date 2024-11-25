package ru.mirea.lab7.math;

class MathCalculable implements MathFunc{
    public double pow(double a,int b){
        if (b == 0){
            return 1;
        }
        if (b>0){
            double z = 1;
            for (int i =0; i<b;i++){
                z=z*a;
            }
            return z;
        }
        return pow(a, -1 * b);
    }
    public double root(double a){
        double[] arr = new double[3];
        arr[0] = 1;
        arr[1]=a;
        arr[2] = a*a;
        for(int i=0;i<40;i++){
            if (arr[1]<(arr[0]+(arr[2]-arr[0])/2)*(arr[0]+(arr[2]-arr[0])/2)){
                arr[2] = (arr[0]+(arr[2]-arr[0])/2);
            } else if (arr[1]>(arr[0]+(arr[2]-arr[0])/2)*(arr[0]+(arr[2]-arr[0])/2)) {
                arr[0] = (arr[0]+(arr[2]-arr[0])/2);
            } else {
                return arr[1];
            }
        }
        return (arr[0]+arr[2])/2;
    }
    public double complex(double a,double b){
        return root((a*a+b*b));
    }
    public double getCircleLength(double a){
        return 2*PI*a;
    }
}