package com.beryl.learn.productcatalog;

import java.util.List;

public class Repository implements IRepository {
    @Override
    public List<String> getCatalog() {
        return List.of("Spices", "Rice");
    }
}
