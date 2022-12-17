package Lesson_7_3;

public interface RandA {
    int gentUserId();
    default int getAdminId() { //метод по умолчанию, если не будет другой реализации используется указанная
        return 1;
    };
    static int getUniversalId() { //не наследуются реализующими классами, вызываются точечной анотацией по имени интерфейса
        return 5;
    }
}
