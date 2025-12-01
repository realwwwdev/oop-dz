package app;

import model.Menus.Dish;
import model.Menus.Menu;
import model.Users.Courier;
import model.Users.Customer;
import enums.Category;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Ivan", "vanek2025@mail.ru", "pizza");
        Courier courier = new Courier(2, "Sam", "sam2025@mail.ru", Courier.TransportType.BIKE);

        Menu menu = new Menu();

        Dish dish1 = new Dish("Burger", 200, Category.MAIN);
        Dish dish2 = new Dish("Juice", 150, Category.DRINK);
        Dish dish3 = new Dish("Pasta", 300, Category.MAIN);
        Dish dish4 = new Dish("Cheesecake", 300, Category.DESSERT);

        customer.getUserInfo();
        courier.getUserInfo();

        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);
        menu.addDish(dish4);

        menu.getDishesByCategory(Category.MAIN);
    }
}