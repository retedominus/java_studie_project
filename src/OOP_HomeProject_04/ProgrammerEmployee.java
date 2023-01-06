package OOP_HomeProject_04;

public class ProgrammerEmployee extends Employee{
    @Override
    public String getJobTitle() {
        return "Программист";
    }

//    @Override
//    public int getSalary() {
//        return 150000;
//    }

    @Override
    public void work() {
        System.out.println("пишет код");
    }
}
