package Homework11;

import java.util.Scanner;

public class Data { // Класс который принимает числа из консоли. Реализована защита от неправильного ввода.
    Scanner iScanner = new Scanner(System.in);

    public int getValue(String title) {
        int a = 0;
        System.out.printf("%s", title);
        while (!iScanner.hasNextInt()) {
            System.out.println("\nВведено неверное значение! Повторите ввод!");
            iScanner.next();
        }
        a = iScanner.nextInt();
        return a;
    }
}
