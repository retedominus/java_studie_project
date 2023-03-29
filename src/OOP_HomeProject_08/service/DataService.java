package OOP_HomeProject_08.service;

import OOP_HomeProject_08.model.User;

public interface DataService<U extends User> {

    void addUser(U user);

    void save(String path);

    void load(String path);
}
