package OOP_HomeProject_06;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentsList;


    public StudentGroup(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public int sizeOfGroup() {
        return this.studentsList.size();
    }

    public Student getStudent(int index) {
        return this.studentsList.get(index);
    }

    public void removeStudent(int index) {
        this.studentsList.remove(index);
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }
}
