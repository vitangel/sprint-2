package model;

public abstract class Food {
    protected int amount; // количество
    protected double price; // цена за единицу
    protected boolean isVegetarian; // вегетарианский

    // Геттеры
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}