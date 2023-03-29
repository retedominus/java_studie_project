package OOP_HomeProject_08.service;

import OOP_HomeProject_08.model.Student;
import OOP_HomeProject_08.util.DataReader;
import OOP_HomeProject_08.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements DataService<Student> {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save(String path) {
        DataWriter.dataWrite(students);
    }

    @Override
    public void load(String path) {
        students = DataReader.dataRead(path);
    }
}
