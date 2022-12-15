package Lesson_6_OOP;

import java.util.Arrays;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * 1. ФИО,
 * 2. номер читательского билета,
 * 3. факультет,
 * 4. дата рождения,
 * 5. телефон.
 * 6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
 * 7. Разработать программу, в которой создается массив объектов данного класса.
 * 8. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль
 * сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book
 * (создать новый класс, содержащий имя и автора книги).
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * .
 * 9. Аналогичным образом перегрузить метод returnBook().
 * Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
 * Или  "Петров В. В. вернул 3 книги".
 */
public class Reader {
    protected String readerName;
    protected String readerId;
    protected String department;
    protected String dateOfBirth;
    protected String phoneNumber;

    public Reader(String readerName, String readerId, String department, String dateOfBirth, String phoneNumber) {
        this.readerName = readerName;
        this.readerId = readerId;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader(String readerName) {
        this.readerName = readerName;
    }

    public void setReaderName(String newReaderName) {
        readerName = newReaderName;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public void takeBook() {

    }

    public void takeBook(int qty) {
        System.out.println(readerName + " взял " + qty + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.println(readerName + " взял книги: " + String.join(", ", bookNames));
    }
    public void  takeBook(Book... books) {
        System.out.println(readerName + " взял книги: " + Arrays.toString(books));
    }

    public void returnBook() {

    }
    public void returnBook(int qty) {
        System.out.println(readerName + " вернул " + qty + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.println(readerName + " вернул книги: " + String.join(", ", bookNames));
    }


}
