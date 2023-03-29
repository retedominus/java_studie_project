package OOP_HomeTask_10.task1;

public class FaceIDUnlock extends UnlockMethod {
    private final String faceId;

    public FaceIDUnlock(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public void unlock(Object value) {
        if (value.equals(faceId)) {
            setStatus("unlocked");
            System.out.println("Access granted. Phone " + status);
        } else {
            System.out.println("Access denied. Phone " + status);
        }
    }

    @Override
    public String toString() {
        return "FaceID";
    }
}
