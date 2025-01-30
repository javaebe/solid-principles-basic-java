package com.beryl.learn.product;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Product p1 = new InHouseProduct();
        Product p2 = new Product();
        Product p3 = new Product();

        List<Product> products = List.of(p1, p2, p3);
        products.forEach(p -> System.out.println(p.getDiscount()));
    }
}
