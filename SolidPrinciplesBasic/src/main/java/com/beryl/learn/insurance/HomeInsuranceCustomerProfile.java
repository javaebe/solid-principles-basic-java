package com.beryl.learn.insurance;

import java.util.Random;

public class HomeInsuranceCustomerProfile implements CustomerProfile {

    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean(); // or false
    }
}
