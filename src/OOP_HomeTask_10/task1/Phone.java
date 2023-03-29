package OOP_HomeTask_10.task1;

import java.util.Scanner;

public class Phone {

    private final String manufacturer;
    private final String model;
    private final UnlockMethod method;

    public Phone(String manufacturer, String model, UnlockMethod method) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.method = method;
    }

    public void unlock() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + Phone.this.method);
        if (in.hasNextInt()) {
            Phone.this.method.unlock(in.nextInt());
        } else {
            Phone.this.method.unlock(in.next());
        }

    }

    public void show() {
        System.out.println(Phone.this);
    }

    @Override
    public String toString() {
        return "Phone " +
                manufacturer + " " + model +
                ", Unlock method: " + method;
    }
}
