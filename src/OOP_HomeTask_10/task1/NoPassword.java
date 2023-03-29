package OOP_HomeTask_10.task1;

public class NoPassword extends UnlockMethod {

    @Override
    public void unlock(Object value) {
        setStatus("unlocked");
        System.out.println("Status - " + status);
    }

    @Override
    public String toString() {
        return "No Password";
    }
}
