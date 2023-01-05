package OOP_HomeProject_01;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(Arrays.asList(
                new Product("Закуска"),
                new HotDrinkProduct("Кола", 15),
                new HotDrinkProduct("Никола", 20),
                new HotDrinkProduct("Чай", 60)
        ));
        System.out.println(machine.findProduct("Никола", 2));
    }

}
