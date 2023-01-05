package OOP_HomeProject_01;

public class HotDrinkProduct extends Product{
    private final int temperature;

    public int getTemperature() {
        return temperature;
    }

    public HotDrinkProduct(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkProduct{" + "name " + super.getName() +
                "temperature=" + temperature +
                '}';
    }
}
