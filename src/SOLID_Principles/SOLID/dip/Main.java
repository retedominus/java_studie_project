package SOLID_Principles.SOLID.dip;

public class Main {
    public static void main(String[] args) {
        Switch sw = new Switch(new Lamp());
        sw.toggle();
        sw.toggle();
        sw.toggle();
        sw.toggle();
    }
}
