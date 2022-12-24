package OOP_Lesson_1;

public class Program {
    public static void main(String[] args) {

        Person alexey = new Person("Алексей", "Петров",
                38, "мужской", "женат","серый", "темные");
        Child marina = new Child(1, "Марина", "Петрова");

        System.out.println(alexey);
        System.out.println(marina);




    }
}
