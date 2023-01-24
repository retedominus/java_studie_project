package OOP_Lesson_03_SOLID.model;

public class SumModel extends CalcModel {

    public SumModel(double value1, double value2) {
        super.x = value1;
        super.y = value2;
    }

    @Override
    public Number result() {
        return x + y;
    }


}
