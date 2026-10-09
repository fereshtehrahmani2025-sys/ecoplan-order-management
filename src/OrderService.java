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
    public Order findOrderById(int id){
        for (Order order:orders){
            if (order.getId()==id){
                return order;
            }
        }
        return null;
    }
}
