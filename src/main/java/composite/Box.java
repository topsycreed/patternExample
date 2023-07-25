package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private String name;
    private double price;
    private List<Component> components;

    public Box(String name, double price) {
        this.name = name;
        this.price = price;
        this.components = new ArrayList<>();
    }

    public Box(String name) {
        this.name = name;
        this.price = 0;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double totalPrice = price;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }
}
