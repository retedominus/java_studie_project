package OOP_Lesson_03_SOLID;

import OOP_Lesson_03_SOLID.controller.Menu;
import OOP_Lesson_03_SOLID.view.View;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new View());
        menu.buttonClick();
    }
}
