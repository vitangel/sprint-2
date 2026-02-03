package main.java.model;

import main.java.model.constants.Colour;
import main.java.model.constants.Discount;

public class Apple extends main.java.model.Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // яблоки вегетарианские
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED) ? Discount.DISCOUNT_FOR_RED_APPLE : 0;
    }
}