package OOP_Lesson_1;

import java.io.IOException;


public interface PersonsDataBase {
    void saveData() throws IOException;
    default String getData() {
        return "Empty";
    }

}
