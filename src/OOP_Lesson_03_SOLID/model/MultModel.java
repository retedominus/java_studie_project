package OOP_Lesson_03_SOLID.model;


public class MultModel extends CalcModel {
    public MultModel(double value1, double value2) {
        super.x = value1;
        super.y = value2;
    }

    @Override
    public Number result() {
        return x * y;
    }

}
