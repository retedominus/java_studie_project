package OOP_HomeProject_07;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(33, "Parrots");
        Pair<Float, Double> pair2 = new Pair<>(2.7f, 3.1415D);

        System.out.println(pair1 + " " + pair2);

        System.out.println(randomColor());



    }

    private static Triple<Integer, Integer, Integer> randomColor() {
        return new Triple<>(randNumber(), randNumber(), randNumber());
    }

    private static int randNumber() {
        return new Random().nextInt(256);
    }
}
