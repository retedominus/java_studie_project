package OOP_Lesson_03_SOLID.controller;

import OOP_Lesson_03_SOLID.model.*;

import java.util.Scanner;

public class Menu {

    private static final String option;

    private App application;

    static {
        option = """
                1. Сложение
                2. Вычетание
                3. Умножение
                4. Деление""";
    }

    public Menu() {
    }

    public int calc(int a, int b) { //переписать метод в void
        int result = 0;
        switch (getOperation()) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = a / b;
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                calc(a, b);
            }
        }
        return result;
    }

    public int getValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int value;
        if (in.hasNextInt()) {
            value = in.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.nextInt();
            value = getValue();
        }
        return value;
    }

    static int getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию:");
        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            scanner.nextInt();
            operation = getOperation();
        }
        return operation;
    }


}
