package OOP_Lesson_2_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scheduler implements NewTask{

    private Map<Integer, Task> tasks;

    private static int id;

    static {
        id = 0;
    }

    public Scheduler(Task task) {
        this.tasks = new HashMap<>();
        tasks.put(++id, task);
    }

    @Override
    public void writeNewTask() {
        Scanner iScan = new Scanner(System.in);

        System.out.println("Введите новую задачу. \nСрок исполнения в формате дд:мм:гггг:");
        String deadline = iScan.nextLine();

        System.out.println("\nАвтор задачи:");
        String author = iScan.nextLine();

        System.out.println("\nОписание задачи:");
        String subject = iScan.nextLine();

        Task newTask = new Task(deadline, author, subject);
        tasks.put(tasks.size() + 1, newTask);

        System.out.println("Хотите внести еще задачи? ");
        String choice = iScan.nextLine();
        if (choice.equalsIgnoreCase("да") || choice.equalsIgnoreCase("yes")) {
            writeNewTask();
        } else {
            iScan.close();
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int key : tasks.keySet()) {
            sb.append("# ").append(key).append(tasks.get(key)).append("\n");
        }
        return "Добро пожаловать в планировщик! (версия 1.0)\n" + sb;
    }


}
