package OOP_HomeProject_07_02;

import java.util.Arrays;

public class Collection<Element> {
    private Element[] array;
    private int size = 0;


    public Collection() {
        this.array = (Element[]) new Object[10];
    }

    public void add(Element arg) {
        if (size < array.length) {
            array[size] = arg;
            size++;
            return;
        }
        array = Arrays.copyOf(array, array.length * 2);

    }

    public Element get(int index) {
        return this.array[index];
    }

    public void set(Element arg, int index) {
        this.array[index] = arg;
    }

    public int size() {
        return this.array.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(" ");

        }
        return sb.toString();
    }
}
