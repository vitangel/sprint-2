package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends model.Food implements model.Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.DISCOUNT_FOR_RED_APPLE;
        }
        return 0;
    }
}