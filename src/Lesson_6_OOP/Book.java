package Lesson_6_OOP;


public class Book {
    protected String name;
    protected String bookWriter;

    public Book(String name, String bookWriter) {
        this.name = name;
        this.bookWriter = bookWriter;
    }
    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
