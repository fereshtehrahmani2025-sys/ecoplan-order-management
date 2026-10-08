public class Order {
    private int id;
    private Customer customer;
    private Product product;
    public Order(int id,Customer customer,Product product){
        this.id=id;
        this.customer=customer;
        this.product=product;
    }
    public void printInfo(){
        System.out.println("Order ID: "+id);
        product.printInfo();
        customer.printInfo();
    }
    public double getTotal(){
        return product.getPrice();
    }
}
