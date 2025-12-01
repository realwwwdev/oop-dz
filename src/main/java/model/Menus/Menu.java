package model.Menus;

import enums.Category;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;
    public Menu() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        System.out.println("Блюдо: " + dish + " добавлено в меню" );
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
        System.out.println("Блюдо: " + dish + " удалено из меню" );
    }

    public List<Dish> getDishesByCategory(Category category) {
        List<Dish> dishesByCategory = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCategory() == category) {
                dishesByCategory.add(dish);
            }
        }
        return dishesByCategory;
    }
}
