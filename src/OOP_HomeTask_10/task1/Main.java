package OOP_HomeTask_10.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", "3310", new PinUnlock(123456));
        phone.show();
        phone.unlock();







    }
}
