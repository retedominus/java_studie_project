package OOP_Lesson_2_1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ImExporter<T> {
    T data;

    ImExporter(T n) {
        data = n;
    }

    void saveData() throws IOException { // доработь запись

        try (FileWriter fw = new FileWriter("planner.*", false)) {
            fw.write(String.valueOf(data));
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Планировщик не найден. Создайте новый. \n " +
                    "Введите желаемый формат хранения данных (1 - csv, 2 - json, 3 - xml): ");
            switch (iScanner.nextLine()) {
                case "1":
                    FileWriter fw = new FileWriter("planner.csv", false);
                    fw.write(String.valueOf(data));
                    fw.flush();
                case "2":
                    FileWriter fw2 = new FileWriter("planner.json", false);
                    fw2.write(String.valueOf(data));
                    fw2.flush();
                case "3":
                    FileWriter fw3 = new FileWriter("planner.xml", false);
                    fw3.write(String.valueOf(data));
                    fw3.flush();
            }

            iScanner.close();

        }
    }

    void readData() {

    }

}
