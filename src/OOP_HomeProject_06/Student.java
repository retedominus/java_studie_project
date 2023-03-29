package OOP_HomeProject_06;

public class Student {
    private String name;
    private float averageGrade;
    private String dateOfBirth;

    public Student(String name, float averageGrade, String dateOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
