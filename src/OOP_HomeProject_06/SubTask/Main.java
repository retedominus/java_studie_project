package OOP_HomeProject_06.SubTask;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("create");
        list.add("update");
        list.add("read");
        list.add("delete");

        Iterator<String> iterator = list.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().toUpperCase());
        }

    }
}
