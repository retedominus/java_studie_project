package Lecture.Base;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Lect_3 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = {day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
    }

    public static void main1(String[] args) {
        Character value = null;
        List<Character> list1 =
                List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);

    }

    public static void main2(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();

        while (col.hasNext()) {
            System.out.println(col.next());


        }

    }

}