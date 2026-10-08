public class Product {
    private int id;
    private String name;
    private double price;
    public Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void printInfo(){
        System.out.println("Product ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
