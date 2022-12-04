package Lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInt {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();

        lst.add(5);
        lst.add(20);
        lst.add(11);
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            int cur = iterator.next();
            if (cur % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(lst);

        System.out.println(Collections.max(lst));
        System.out.println(Collections.min(lst));
        lst.removeAll(lst);
        System.out.println(lst);


    }

}
