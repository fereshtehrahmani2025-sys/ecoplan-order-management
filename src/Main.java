import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        System.out.println("Order Management System");
        Customer customer1=new Customer(1,"Max Müller","max@example.com");
      //  customer1.printInfo();
        Product product1=new Product(1,"Laptop",899.99);
       // product1.printInfo();
        Order order1=new Order(101,customer1,product1,2);
       // order1.printInfo();
        Product product2=new Product(2,"Mouse",29.99);
        Order order2=new Order(102,customer1,product2,3);
        ArrayList<Order>orders=new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        order1.setStatus(OrderStatus.SHIPPED);
        if (order1.getStatus()==OrderStatus.SHIPPED){
            System.out.println("Order 101 has been shipped");
        }
        System.out.println("Total Orders: "+orders.size());
        for (Order order : orders){
            order.printInfo();
            System.out.println("Order Total: "+order.getTotal());
        }
    }
}