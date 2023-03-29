package OOP_HomeProject_06;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int index = - 1;
    private StudentGroup studentsList;

    public StudentGroupIterator(StudentGroup studentsList) {
        this.studentsList = studentsList;
    }


    @Override
    public boolean hasNext() {
        return this.index < studentsList.sizeOfGroup() - 1;
    }

    @Override
    public Student next() {
        this.index++;
        return studentsList.getStudent(index);
    }
}
