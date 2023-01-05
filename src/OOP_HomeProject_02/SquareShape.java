package OOP_HomeProject_02;

public class SquareShape extends Shape{
    private float side; //вычислимое поле

    public SquareShape(float side) {
        this.side = side;
    }

    @Override
    public float getArea() { //не возвращает заданное значение а вычисляет его
        return side * side;
    }

    @Override
    public float getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "side=" + side +
                '}';
    }
}
