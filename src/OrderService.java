import java.util.ArrayList;
public class OrderService {
    private ArrayList<Order> orders=new ArrayList<>();
    public void addOrder(Order order){
        orders.add(order);
        System.out.println("Order added successfully.");
    }
    public ArrayList<Order> getAllOrder() {
        return orders;
    }
}
