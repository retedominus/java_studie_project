package SOLID_Principles.SOLID.lsp;

public class Rectangle implements Shape{

    private float width;
    private float height;

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea() {
        return this.height * this.width;
    }
}
