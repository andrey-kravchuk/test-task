import java.util.ArrayList;

public interface Executable {
    ArrayList<String> execute(Box[] boxes, Product[] products, Order[] orders);
}
