package OOP_HomeProject_01;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product findProduct(String name, int temperature) {
        for (Product product : products) {

            if (!(product instanceof HotDrinkProduct))
                continue;

            if (product.getName().equalsIgnoreCase(name) &&
                    ((HotDrinkProduct) product).getTemperature() == temperature) //upcast product до hotDrink
                return product;
        }
        throw new IllegalStateException("Товар не найден!");
    }
}
