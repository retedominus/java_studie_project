package Lesson_7;

public class Program {
    public static void main(String[] args) {
        RealisationNums obj = new RealisationNums();
        RealisationNums_1 obj_1 = new RealisationNums_1();
        Nums obi; // Интерфейсная ссылка, позволяет применять только методы объявленные в интерфейсе


        for (int i = 0; i < 5; i++) {
            obi = obj;
            System.out.println("Следующее значение: " + obi.getNext());
        }

        for (int i = 0; i < 5; i++) {
            obi = obj_1;
            System.out.println("Следующее значение: " + obi.getNext());
        }

        obj.print_1();


    }
}
