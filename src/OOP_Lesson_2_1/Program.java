package OOP_Lesson_2_1;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        Scheduler myScheduler = new Scheduler(new Task());
        ImExporter<Scheduler> myPlanner = new ImExporter<>(myScheduler);

        myScheduler.writeNewTask();



        System.out.println(myScheduler);

        myPlanner.saveData();



    }

}
