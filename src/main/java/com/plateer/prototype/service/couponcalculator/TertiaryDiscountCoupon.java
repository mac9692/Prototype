package com.plateer.prototype.service.couponcalculator;

import com.plateer.prototype.service.couponset.AbstractCoupon;
import com.plateer.prototype.service.couponset.BasketCoupon;
import com.plateer.prototype.service.couponset.PricingCoupon;
import org.springframework.stereotype.Service;

@Service
public class TertiaryDiscountCoupon extends AbstractCouponCalculator{
    @Override
    public AbstractCoupon discountCoupon(String type) {
        if("basket".equals(type)) {
            return new BasketCoupon();
        } else if ("pricing".equals(type)) {
            return new PricingCoupon();
        } else {
            return null;
        }
    }
}
