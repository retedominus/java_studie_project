package Lesson_7;

public class RealisationNums implements Nums {

    int start;
    int val;
    int prev;

    RealisationNums() {
        start = 0;
        val = 0;
        prev =  -2;

    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;

    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    public void print_1() {
        System.out.println("Новый метод");
    }
}
