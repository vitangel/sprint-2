package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends model.Food implements model.Discountable {
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