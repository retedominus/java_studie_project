package Lesson_6_OOP;

public class Person {

    // поля
    String name;
    int age;

    // конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    // функции экземпляра
    @Override
    public String toString() {
        return "Person{ " +
                "name: " + name + ", " +
                "age: " + age +
                " }";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {

        Person vlad = new Person();
        vlad.name = "Vlad";
        vlad.age = 23;

        System.out.println(vlad);
        System.out.println(Integer.toHexString(vlad.hashCode()));

        Person some = new Person("Some", 5);
        System.out.println(some);
        some.setName("newSomeName");
        System.out.println(some);
    }
}

