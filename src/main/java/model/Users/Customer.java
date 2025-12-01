package model.Users;

public class Customer extends User {
    private String order;

    public Customer(int id, String name, String email, String order) {
        super(id, name, email);
        this.order = order;
    }

    public String getOrder() {return order;}

    public void setOrder(String order) {this.order = order;}

    public void getUserInfo() {
        System.out.println("Customer: " + name + " >>> " + " email: " + email + " >>> " + " order: " + order);
    }
}
