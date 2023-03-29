package SOLID_Principles.SOLID.srp;

public class GraphicRectangle extends CalcRectangle {


    public GraphicRectangle(int width, int height) {
        super(width, height);
    }

    // графическая задача
    public void draw () {
        GraphicsLibrary.drawRectangle(0, 0, getWidth(), getHeight(), '#');
    }
}
