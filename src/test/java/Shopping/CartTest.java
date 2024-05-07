package Shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void subTotalTest() {{
        double expected = 10.00;

        Product hat1 = new Hat(1, Size.S, 8.00, "Jordan", 2);
        Product soda1 = new Soda(1, Size.S, 2.00, "Pepsi", 2);

        User user = new User();
        user.addToCart(hat1, 1);
        user.addToCart(soda1, 1);
        double actual = user.getCart().subTotal();

        Assertions.assertEquals(expected, actual);
        }
    }
}