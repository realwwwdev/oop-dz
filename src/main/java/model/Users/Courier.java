package model.Users;

public class Courier extends User {
    public enum TransportType {
        BIKE,
        CAR,
        FOOT
    }

    private TransportType transport;

    public Courier(int id, String name, String email, TransportType transport) {
        super(id, name, email);
        this.transport = transport;
    }

    public void setTransport (TransportType transport) {this.transport = transport;}
    public TransportType getTransport() {
        return transport;
    }

    public void getUserInfo() {
        System.out.println("Courier" + " >>> " + name + " Тип доставки" + " >>> " + transport);
    }
}
