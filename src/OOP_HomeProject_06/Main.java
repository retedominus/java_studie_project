package OOP_HomeProject_06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentsList =
                new StudentGroup(Arrays.asList(
                        new Student ("Alex", 4.68f, "23.05.1983"),
                        new Student ("Felix", 3.82f, "18.10.1992"),
                        new Student ("Petr", 4.54f, "10.12.2000"),
                        new Student ("Ivan", 4.22f, "07.01.2001")));


        Iterator<Student> studentIterator = studentsList.iterator();

        System.out.println("--Iterator--");
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

        System.out.println("\n--ListIterator--");

        ListIterator<Student> listIterator = studentsList.listIterator();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
