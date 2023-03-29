package Lesson_8.Task3;

import java.util.function.Function;

// interface Function < T, R > {
// R apply (T m);
//}

public class LambdaDemo5 {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(30));
    }
}