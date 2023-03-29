package OOP_HomeTask_10.task1;

public class FingerprintUnlock extends UnlockMethod {
    private final String fingerprint;

    public FingerprintUnlock(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock(Object value) {
        if (value.equals(fingerprint)) {
            setStatus("unlocked");
            System.out.println("Access granted. Phone " + status);
        } else {
            System.out.println("Access denied. Phone " + status);
        }
    }

    @Override
    public String toString() {
        return "Fingerprint";
    }
}
