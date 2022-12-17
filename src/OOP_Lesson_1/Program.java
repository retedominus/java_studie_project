package OOP_Lesson_1;

public class Program {
    public static void main(String[] args) {
        Person alexey = new Person("Алексей", "Петров",
                38, "мужской", "женат","серый", "темные");
        System.out.println(alexey);
        Person alena = new Person("Алена", "Петрова",
                32, "женский", "замужем", "зеленый", "блондинка");
        System.out.println(alena);
        Person sofie = new Person("Софья", "Иванова",
                12, "женский", "не замужем", "голубые", "блондинка");
        System.out.println(sofie);
    }
}
