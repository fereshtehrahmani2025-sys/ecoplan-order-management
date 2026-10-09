public class Order {
    private int id;
    private Customer customer;
    private Product product;
    private int quantity;
    private OrderStatus status;
    public Order(int id,Customer customer,Product product,int quantity){
        this.id=id;
        this.customer=customer;
        this.product=product;
        this.quantity=quantity;
        this.status=OrderStatus.PENDING;
    }
    public void printInfo(){
        System.out.println("Order ID: "+ id);
        System.out.println("Order Status: "+ status);
        product.printInfo();
        customer.printInfo();
    }
    public double getTotal(){
        return product.getPrice()*quantity;
    }
    public void setStatus(OrderStatus status){
        this.status=status;
    }
    public OrderStatus getStatus(){
        return status;
    }
    public void cancelOrder(){
        if (status==OrderStatus.PENDING){
            status=OrderStatus.CANCELLED;
            System.out.println("Order "+ id  +  "  cancelled successfully.");
        }
        else {
            System.out.println("Order "+ id  +  "  cannnot be cancelled.");
        }
    }
}
