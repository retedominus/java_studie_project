package OOP_HomeProject_06;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private StudentGroup otherStudentList;

    int index = -1;
    int lastObjIndex;

    public GroupListIterator(StudentGroup otherStudentList) {
        this.otherStudentList = otherStudentList;
        lastObjIndex = otherStudentList.sizeOfGroup();
    }

    @Override
    public boolean hasNext() {
        return this.index < otherStudentList.sizeOfGroup() - 1;
    }

    @Override
    public Student next() {
        index++;
        return otherStudentList.getStudent(index);
    }

    @Override
    public boolean hasPrevious() {
        return lastObjIndex > 0;
    }

    @Override
    public Student previous() {
        lastObjIndex--;
        return otherStudentList.getStudent(lastObjIndex);
    }

    @Override
    public int nextIndex() {
        return index++;
    }

    @Override
    public int previousIndex() {
        return lastObjIndex--;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }
}
