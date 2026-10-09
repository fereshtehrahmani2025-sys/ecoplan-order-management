import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        System.out.println("Order Management System");
        Customer customer1 = new Customer(1, "Max Müller", "max@example.com");
        //  customer1.printInfo();
        Product product1 = new Product(1, "Laptop", 899.99);
        // product1.printInfo();
        Order order1 = new Order(101, customer1, product1, 2);
        orderService.addOrder(order1);
        // order1.printInfo();
        Product product2 = new Product(2, "Mouse", 29.99);
        Order order2 = new Order(102, customer1, product2, 3);
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        //OrderService orderService = new OrderService();
        // orderService.addOrder(order1);
        orderService.addOrder(order2);
        System.out.println(("Orders in OrderService: " + orderService.getAllOrder().size()));
        for (Order order : orderService.getAllOrder()) {
            order.printInfo();
        }
        order2.cancelOrder();
        System.out.println("Order 102 status: " + order2.getStatus());
        order1.setStatus(OrderStatus.SHIPPED);
        order1.cancelOrder();
        if (order1.getStatus() == OrderStatus.SHIPPED) {
            System.out.println("Order 101 has been shipped");
        }
        System.out.println("Total Orders: " + orders.size());
        for (Order order : orders) {
            order.printInfo();
            System.out.println("Order Total: " + order.getTotal());
        }
        // }
        Order foundOrder = orderService.findOrderById(101);
        if (foundOrder != null) {
            System.out.println("Order found: ");
            foundOrder.printInfo();
        } else {
            System.out.println("Order not found. ");
        }
    }
}