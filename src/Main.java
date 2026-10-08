public class Main {
    public static void main(String[] args){
        System.out.println("Order Management System");
        Customer customer1=new Customer(1,"Max Müller","max@example.com");
      //  customer1.printInfo();
        Product product1=new Product(1,"Laptop",899.99);
       // product1.printInfo();
        Order order1=new Order(101,customer1,product1);
        order1.printInfo();
    }
}