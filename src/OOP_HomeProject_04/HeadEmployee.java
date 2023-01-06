package OOP_HomeProject_04;


import java.util.List;

public class HeadEmployee extends Employee{

    private final List<Employee> employees;

    public HeadEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String getJobTitle() {
        return "Директор";
    }

//    @Override
//    public int getSalary() {
//        return 200000;
//    }

    @Override
    public void work() {
        for (Employee employee : employees) {
            System.out.println("Пришел босс и заставил всех работать. ");
            System.out.println(employee.getJobTitle());
            employee.work();
        }
    }

}
