package Lesson_8.Task3;

import java.util.function.Consumer;

public class LambdaDemo6 {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
