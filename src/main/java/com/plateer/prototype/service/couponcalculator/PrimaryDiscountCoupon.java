package com.plateer.prototype.service.couponcalculator;

import com.plateer.prototype.service.couponset.AbstractCoupon;
import com.plateer.prototype.service.couponset.ProductCoupon;
import org.springframework.stereotype.Service;


@Service
public class PrimaryDiscountCoupon extends AbstractCouponCalculator{
    @Override
    public AbstractCoupon discountCoupon(String type) {
        if("product".equals(type)) {
            return new ProductCoupon();
        } else {
            return null;
        }
    }
}
