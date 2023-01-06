package OOP_HomeProject_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ProgrammerEmployee());
        employees.add(new DesignerEmployee());
        Employee boss = new HeadEmployee(employees);


        boss.work();

    }
}
