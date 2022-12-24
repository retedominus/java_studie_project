package Lesson_8.Task1;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNums myNum;
        myNum = () -> 98.6; // простое лямбда выражение

        System.out.println("постоянное значение " + myNum.getNum());
        MyParamNums myPNum = (n) -> 1.0 / n;

        System.out.println("обратная величина 4 = " + myPNum.getNums(4.0));
        System.out.println("обратная величина 8 = " + myPNum.getNums(8.0));

    }

}
