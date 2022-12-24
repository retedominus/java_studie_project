package OOP_Lesson_1;

public class Child extends Person{
    protected Integer parentId;

    Child(Integer parentId, String firstName, String lastName) {
        super(firstName, lastName);
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + Relatives.getDaughter() + " " + parentId;
    }
}
