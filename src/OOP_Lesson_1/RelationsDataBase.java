package OOP_Lesson_1;
public interface RelationsDataBase {
    void saveData();
    default String getData() {
        return "Empty";
    }
}
