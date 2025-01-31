package com.beryl.learn.productcatalog;

public class Test {
    public static void main(String[] args) {
        IRepository repository = Factory.create();
        ProductCatalog catalog = new ProductCatalog(repository);
        System.out.println(catalog.getCatalog());
    }
}
