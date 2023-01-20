package OOP_Lesson_03_SOLID.model;

public class SubModel extends CalcModel{
    @Override
    public int result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
