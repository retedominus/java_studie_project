package OOP_Lesson_03_SOLID.model;

import OOP_Lesson_03_SOLID.controller.Menu;
import OOP_Lesson_03_SOLID.view.View;


public class App {
    CalcModel model;
    Menu menu;
    View view;

    public App() {

    }


    public Menu getMenu() {
        return menu;
    }

    public void buttonClick(){
        view.showMenu();
        model.setX(menu.getValue());
        model.setY(menu.getValue());
        view.print(this.menu.calc(model.x, model.y), "Результат операции");

    }


}
