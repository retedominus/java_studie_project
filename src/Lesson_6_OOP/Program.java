package Lesson_6_OOP;

public class Program {
    public static void main(String[] args) {
        Reader petrov = new Reader("Петров В. В.");
        Reader[] readers = new Reader[]{new Reader("Boris"), new Reader("Ignat"),
                new Reader("Elisey")};
        Book[] books;
        books = new Book[] {new Book("Приключения"), new Book("Словарь"),
                     new Book("Энциклопедия")};

        petrov.takeBook(3);
        String[] booksList = {"Приключения", "Словарь", "Энциклопедия"};
        petrov.takeBook(booksList);
        petrov.takeBook(books);
        petrov.returnBook(3);
        petrov.returnBook(booksList);

    }

}
