package app;

import model.Users.Courier;
import model.Users.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Ivan", "vanek2025@mail.ru", "pizza");
        Courier courier = new Courier(2, "Ivan", "vanek2025@mail.ru", Courier.TransportType.BIKE);

        customer.getUserInfo();
        courier.getUserInfo();
    }
}