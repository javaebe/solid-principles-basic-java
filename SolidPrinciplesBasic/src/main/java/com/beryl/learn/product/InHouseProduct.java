package com.beryl.learn.product;

public class InHouseProduct extends Product {

    public void addExtraDiscount() {
        discount = discount * 1.5;
    }

    @Override
    public double getDiscount() {
        this.addExtraDiscount();
        return discount;
    }
}
