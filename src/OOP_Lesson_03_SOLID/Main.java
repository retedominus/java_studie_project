package OOP_Lesson_03_SOLID;

import OOP_Lesson_03_SOLID.controller.Menu;
import OOP_Lesson_03_SOLID.model.SumModel;
import OOP_Lesson_03_SOLID.model.App;
import OOP_Lesson_03_SOLID.view.View;


public class Main {
    public static void main(String[] args) {
        App calculator = new App();
        Menu menu = new Menu();

        calculator.buttonClick();
//        System.out.println(menu.toString());

    }
}
