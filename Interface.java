package Homework11;

import java.util.Scanner;

public class Interface { // Пользовательский интерфейс. Реализованна защита от неправильного ввода.
    static Scanner iScanner = new Scanner(System.in);

    public static void menu1() {
        System.out.println("\nКалькулятор!");
        System.out.println("\nВыберите действие:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление");
        switch (iScanner.nextLine()) {
            case ("1"):
                Calculation a = new Calculation(new Sum(), new Data());
                a.result("+");
                menu2();
                break;
            case ("2"):
                Calculation b = new Calculation(new Sub(), new Data());
                b.result("-");
                menu2();
                break;
            case ("3"):
                Calculation c = new Calculation(new Mult(), new Data());
                c.result("*");
                menu2();
                break;
            case ("4"):
                Calculation d = new Calculation(new Div(), new Data());
                d.result("/");
                menu2();
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                menu1();
                break;
        }
    }

    public static void menu2() {
        System.out.println("\nПродолжить работу с калькулятором?\n1 - Да\n2 - Нет");
        switch (iScanner.nextLine()) {
            case ("1"):
                menu1();
                break;
            case ("2"):
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                menu2();
                break;
        }
    }
}
