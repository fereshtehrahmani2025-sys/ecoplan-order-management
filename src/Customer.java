public class Customer {
    private int id;
    private String name;
    private String email;
    public Customer(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public void printInfo(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}
