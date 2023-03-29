package OOP_HomeProject_05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ImportDataJson extends ImportData {
    @Override
    public void saveData(Map<String, Float> students) {

        try (FileWriter fileWriter = new FileWriter("Students.json", true)) {
            fileWriter.write("{\n");
            for (String name : students.keySet()) {
                fileWriter.write("\"" + name + "\"" + ": " + students.get(name));
                fileWriter.append(",\n");
            }
            fileWriter.append("}");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

