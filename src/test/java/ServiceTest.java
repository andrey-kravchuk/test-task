import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ServiceTest {

    @Test
    public void testExecute() {
        Box[] caseOfBox = {
                new Box(1, 2, 3, 4),
                new Box(2, 4, 6, 8),
                new Box(3, 4, 2, 7),
                new Box(4, 5, 7, 8)
        };

        Product[] products = {
                new Product(1, 4, 5, 6),
                new Product(2, 5, 5, 2),
                new Product(3, 2, 2, 2)
        };

        Order[] orderLines = {
                new Order(1,1,1),
                new Order(2,2,2),
                new Order(3,1,3)
        };

        Service service = new Service();

        System.out.println(service.execute(caseOfBox, products, orderLines));

    }
}