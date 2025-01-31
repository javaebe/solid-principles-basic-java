package com.beryl.learn.productcatalog;

public class Factory {
    public static IRepository create() {
        return new Repository();
    }
}
