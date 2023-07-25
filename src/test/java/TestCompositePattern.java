import composite.Box;
import composite.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCompositePattern {

    @Test
    public void compositePatternTest() {
        // Create some products
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);
        Product product3 = new Product("Product 3", 20.0);

        // Create a box and add products to it
        Box box1 = new Box("Box 1");
        box1.addComponent(product1);
        box1.addComponent(product2);

        // Create another box and add a product to it
        Box box2 = new Box("Box 2", 5.0);
        box2.addComponent(product3);

        // Add the second box to the first box
        box1.addComponent(box2);

        // Calculate the overall price for the first box
        double totalPrice = box1.getPrice();
        System.out.println("Total price for " + box1.getName() + ": $" + totalPrice);
        // Output: Total price for Box 1: $45.0
        assertEquals(50.0, totalPrice, 0.01);
    }
}
