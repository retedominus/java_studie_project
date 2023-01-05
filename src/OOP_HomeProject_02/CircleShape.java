package OOP_HomeProject_02;

public class CircleShape extends Shape{

    private float radius;

    public CircleShape(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius; // Math.PI это double поэто явно нужно привести к типу float
    }

    @Override
    public float getPerimeter() {
        return 2 * (float) Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "radius=" + radius +
                '}';
    }
}
