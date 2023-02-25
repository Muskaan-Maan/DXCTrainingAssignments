import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void calculateFinalPrice() {
        Product p = new Product("Sunsilk", 275.9f, 2);
        assertEquals(264.86398f, p.calculateFinalPrice(4));

    }
}