package Lesson_8.Task3;

import java.util.function.BinaryOperator;

// interface BinaryOperator <T> {
    // T apply ( T n, T m);
//}

public class LambdaDemo4 {
    public static void main(String[] args) {
        BinaryOperator<Integer> m = (x, y) -> x * y;
        System.out.println(m.apply(3,5));
        System.out.println(m.apply(2,8));
    }
}
