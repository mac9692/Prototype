package com.plateer.prototype.service.couponcalculator;

import com.plateer.prototype.service.couponset.AbstractCoupon;
import com.plateer.prototype.service.couponset.OverlapCoupon;
import org.springframework.stereotype.Service;

@Service
public class SecondaryDiscountCoupon extends AbstractCouponCalculator{
    @Override
    public AbstractCoupon discountCoupon(String type) {
        if ("overlap".equals(type)) {
            return new OverlapCoupon();
        } else {
            return null;
        }
    }
}
