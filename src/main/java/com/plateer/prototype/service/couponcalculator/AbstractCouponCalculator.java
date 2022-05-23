package com.plateer.prototype.service.couponcalculator;

import com.plateer.prototype.service.couponset.AbstractCoupon;


public abstract class AbstractCouponCalculator {
    public AbstractCoupon discountCalCoupon(String type) {
        AbstractCoupon ac = discountCoupon(type);

        ac.validation();
        ac.discount();

        return null;
    }


    public abstract AbstractCoupon discountCoupon(String type);
}
