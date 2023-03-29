package Lesson_9;

public class Numeric<T extends Number> {
    T num;
    Numeric(T n) {
       num = n;
    }

    double recNum() {
        return 1 / num.doubleValue();
    }

}
