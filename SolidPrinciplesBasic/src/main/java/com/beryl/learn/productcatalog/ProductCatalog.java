package com.beryl.learn.productcatalog;

import java.util.List;

public class ProductCatalog {
    private final IRepository repository;

    public ProductCatalog(IRepository repository) {
        this.repository = repository;
    }

    public List<String> getCatalog() {
        return repository.getCatalog();
    }
}
