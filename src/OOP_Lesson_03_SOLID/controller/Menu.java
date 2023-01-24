package OOP_Lesson_03_SOLID.controller;

import OOP_Lesson_03_SOLID.model.*;
import OOP_Lesson_03_SOLID.view.View;

import java.util.Scanner;

public class Menu {

    private static final String option;

    private final View view;

    static {
        option = """
                1. Сложение
                2. Вычетание
                3. Умножение
                4. Деление
                5. Выход
                """;
    }

    public Menu(View view) {
        this.view = view;
    }

    public Number calc() {
        int choose = getOperation();
        Number result;
        result = switch (choose) {
            case 1 -> new SumModel(getValue(), getValue()).result();
            case 2 -> new SubModel(getValue(), getValue()).result();
            case 3 -> new MultModel(getValue(), getValue()).result();
            case 4 -> new DivModel(getValue(), getValue()).result();
            case 5 -> throw new RuntimeException("Выход выполнен");
            default -> throw new IllegalStateException("Выбранная операция - " + choose + " не поддерживается.");
        };
        return result;
    }

    static double getValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите рациональное число:");
        double value;
        if (in.hasNextDouble()) {
            value = in.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.nextDouble();
            value = getValue();
        }
        return value;
    }

    static int getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию.\n");
        System.out.println(option);
        int operation;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода. Попробуйте ввести номер операции.");
            scanner.nextInt();
            operation = getOperation();
        }
        return operation;
    }

    public void buttonClick() {
        view.showTitle("\nДобро пожаловать в калькулятор.\nЯ могу выполнять операции с рациональными числами.\n");
        while (true) {
            view.showResult(calc());
        }



    }
}
