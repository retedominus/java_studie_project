package OOP_HomeTask_10.task1;

public abstract class UnlockMethod implements IUnlock{

    protected static String status;


    static {
        status = "locked";
    }



    public static void setStatus(String status) {
        UnlockMethod.status = status;
    }


}


