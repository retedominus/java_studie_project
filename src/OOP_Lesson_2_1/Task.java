package OOP_Lesson_2_1;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    protected String addDate;
    protected String addTime;
    protected static String deadline;
    protected String authorName;
    protected String subject;
    protected int priority;


    Task(String deadline, String authorName, String subject) {
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        Task.deadline = deadline;
        this.authorName = authorName;
        this.subject = subject;

    }

    Task() {

    }


    public String getAddDate() {
        return addDate;
    }

    public String getAddTime() {
        return addTime;
    }

    public static String getDeadline() {
        return deadline;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getSubject() {
        return subject;
    }

    public static void setDeadline(String deadline) {
        Task.deadline = deadline;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return ", Автор: " + authorName +
                ", Дата и время добавления: " + addDate +
                " " + addTime +
                ", Контрольный срок: " + deadline +
                ", Содержание задачи: " + subject;
    }

    public void setPriority() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Установите приоритет задачи (1 - наивысший, 2 - средний, 3 - низший): ");
        try {
            this.priority = iScan.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Попробуйте снова: нужно вводить число от 1 до 3.");
            this.priority = iScan.nextInt();
        }
        iScan.close();
    }

    public String getPriority() {
        return switch (priority) {
            case 1 -> "Наивысший. Немедленно исполнить.";
            case 2 -> "Средний. Исполняется при отсутсвии задач высшего приоритета.";
            case 3 -> "Низший. Разумный срок.";
            default -> "Приоритет не установлен.";
        };
    }
}
