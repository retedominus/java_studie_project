package OOP_HomeProject_05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ImportDataXml extends ImportData {
    @Override
    public void saveData(Map<String, Float> students) {

        File file = new File("Students.xml");
        if (!file.exists()) {
            try (FileWriter fileWriter = new FileWriter("Students.xml", true)) {

                fileWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                fileWriter.write("<students>\n");
                for (String name : students.keySet()) {
                    fileWriter.write("  <student>\n");
                    fileWriter.write("    <name>" + name + "</name>\n");
                    fileWriter.write("    <grade>" + students.get(name) + "</grade>\n");
                    fileWriter.write("  </student>\n");
                }
                fileWriter.write("</students>\n");
                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try (FileWriter fileWriter = new FileWriter("Students.xml", true)) {

                fileWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                fileWriter.write("<students>\n");
                for (String name : students.keySet()) {
                    fileWriter.write("  <student>\n");
                    fileWriter.write("    <name>" + name + "</name>\n");
                    fileWriter.write("    <grade>" + students.get(name) + "</grade>\n");
                    fileWriter.write("  </student>\n");
                }
                fileWriter.write("</students>\n");
                fileWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
