package OOP_HomeTask_10.task1;

public class PinUnlock extends UnlockMethod {

    private final int pin;

    public PinUnlock(int pin) {
        this.pin = pin;
    }


    @Override
    public void unlock(Object value) {

        if (value.equals(pin)) {
            setStatus("unlocked");
            System.out.println("Access granted. Phone " + status);
        } else {
            System.out.println("Access denied. Phone " + status);
        }
    }

    @Override
    public String toString() {
        return "Pin Code";
    }
}
