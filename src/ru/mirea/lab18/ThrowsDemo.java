package ru.mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Введите значение:");
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            getKey();
        }

    }
    public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Введено пустое значение");
        }
        return "data for " + key;
    }
}

