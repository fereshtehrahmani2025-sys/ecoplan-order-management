public class Order {
    private int id;
    private Customer customer;
    private Product product;
    private int quantity;
    public Order(int id,Customer customer,Product product,int quantity){
        this.id=id;
        this.customer=customer;
        this.product=product;
        this.quantity=quantity;
    }
    public void printInfo(){
        System.out.println("Order ID: "+id);
        product.printInfo();
        customer.printInfo();
    }
    public double getTotal(){
        return product.getPrice()*quantity;
    }
}
