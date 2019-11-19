import java.util.ArrayList;

public class Service implements Executable{
    @Override
    public ArrayList<String> execute(Box[] boxes, Product[] products, Order[] orders) {
        ArrayList<String> caseOfOrders = new ArrayList<>();

        for (Order o: orders) {
            if (o != null){
                int numberOfProduct = o.getNumberOfProducts();
                int optimalBox = 0;

                while (numberOfProduct > 0) {
                    float minEmptyPlace = 10000;

                    for (Box b : boxes) {
                        if (b != null) {
                            float emptyPlace = b.volume() - products[o.getProductId() - 1].volume();
                            if (emptyPlace >= 0 & emptyPlace < minEmptyPlace) {
                                minEmptyPlace = emptyPlace;
                                optimalBox = b.getId();
                            }
                        }
                    }
                    caseOfOrders.add("{ product id = " + o.getProductId() + "; box id = " + optimalBox + " }");
                    numberOfProduct--;
                    boxes[optimalBox - 1] = null;
                }
            }
        }
        return caseOfOrders;
    }
}
