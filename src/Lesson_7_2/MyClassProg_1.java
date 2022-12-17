package Lesson_7_2;

public class MyClassProg_1 implements B {
//При имплементировании интерфейса наследующего от другого необходимо указывать все методы из всех
// интерфесов предшественников
    @Override
    public void meth_1() {
        System.out.println("Реализация метода meth_1");
    }

    @Override
    public void meth_2() {
        System.out.println("Реализация метода meth_2");

    }

    @Override
    public void meth_3() {
        System.out.println("Реализация метода meth_3");

    }
}
