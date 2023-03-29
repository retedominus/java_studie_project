package OOP_HomeProject_05;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> students = new HashMap<>();
        students.put("Иван Иванов", 4.8f);
        students.put("Мария Кузнецова", 5.0f);
        students.put("Степан Кузьмин", 3.6f);

        ImportDataTxt txtFile = new ImportDataTxt();
        ImportDataJson jsonFile = new ImportDataJson();
        ImportDataXml xmlFile = new ImportDataXml();

        txtFile.saveData(students);
        jsonFile.saveData(students);
        xmlFile.saveData(students);





    }
}
