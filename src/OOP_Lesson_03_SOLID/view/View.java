package OOP_Lesson_03_SOLID.view;

import OOP_Lesson_03_SOLID.model.App;

public class View {

    App application;


    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void showMenu() {
        System.out.println(application.getMenu());
    }
}
