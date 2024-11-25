package ru.mirea.lab8.palindrom;

public class palind {
    public String palindrom(String word){
        char[] z = new char[word.length()];
        z = word.toCharArray();
        if (z.length == 1 || (z.length == 2 && z[0] == z[1])){
            return "Yes";
        } else if (z[0] != z[z.length-1]) {
            return "No";
        }
        else {
            word = word.substring(1,z.length-1);
            return palindrom(word);
        }
    }
}
