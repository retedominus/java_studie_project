package OOP_HomeProject_07_01.services;

import OOP_HomeProject_07_01.models.User;

public class UserService<U extends User> {
    public U login(String username, String password) {
        return null;
    }

    public U register(String username, String password) {
        return null;
    }

    public void showProfile(U user) {
        System.out.println(user.getUsername());
    }
}
