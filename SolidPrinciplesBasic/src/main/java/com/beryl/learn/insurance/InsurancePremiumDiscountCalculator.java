package com.beryl.learn.insurance;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(CustomerProfile customerProfile) {
        if (customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}
