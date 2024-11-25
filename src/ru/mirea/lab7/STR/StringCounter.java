package ru.mirea.lab7.STR;

import org.jetbrains.annotations.NotNull;

class StringCounter implements Strings{
    public int counter(@NotNull String str){
        int i = 0;
        for (char element: str.toCharArray()){
            i+=1;
        }
        return i;
    }
    public String newStr(@NotNull String str){
        int i=0;
        String z = "";
        for (char element: str.toCharArray()){
            i+=1;
            if (i%2 == 1){
                z += element;
            }
        }
    return z;
    }
    public String invertedStr(String s){
        String z = "";
        char[] element = s.toCharArray();
        for (int i=counter(s)-1; i >= 0;i--){
                z += element[i];

        }
        return z;
    }
}
