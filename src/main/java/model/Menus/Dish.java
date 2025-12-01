package model.Menus;

import enums.Category;

public class Dish {
    String name;
    double price;
    Category category;

    public Dish(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Category getCategory() {
        return category;
    }

    public String toString() {
        return name + " Цена: " + price + " Категория: " + category;
    }
}
