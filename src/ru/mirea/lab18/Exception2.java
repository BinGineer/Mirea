package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer "); try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException a){
            System.out.println("Вы ввели не число");
        } catch (ArithmeticException a){
            System.out.println("Вы ввели 0");
        }
        finally {
            System.out.println("Конец выполнения программы");
        }

    }
}
