package OOP_HomeProject_04;

public class DesignerEmployee extends Employee{
    @Override
    public String getJobTitle() {
        return "Дизайнер";
    }

//    @Override
//    public int getSalary() {
//        return 100000;
//    }

    @Override
    public void work() {
        System.out.println("рисует графику");
    }
}
