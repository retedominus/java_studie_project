package OOP_HomeProject_05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ImportDataTxt extends ImportData {
    @Override
    public void saveData(Map<String, Float> students) {

        try (FileWriter fileWriter = new FileWriter("Students.txt", true)) {
            for (String name : students.keySet()) {
                fileWriter.write(name + "=" + students.get(name));
                fileWriter.append("\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
