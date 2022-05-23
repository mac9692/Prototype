package com.plateer.prototype.service.pricecal;

import com.plateer.prototype.service.couponcalculator.AbstractCouponCalculator;
import com.plateer.prototype.service.couponcalculator.PrimaryDiscountCoupon;
import com.plateer.prototype.service.couponcalculator.SecondaryDiscountCoupon;
import com.plateer.prototype.service.couponcalculator.TertiaryDiscountCoupon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class couponPriceCalculationTest {
    private final PrimaryDiscountCoupon pdc;
    private final SecondaryDiscountCoupon sdc;
    private final TertiaryDiscountCoupon tdc;

    public List priceCalculation() {
        System.out.println("===쿠폰할인계산 시작===");
        System.out.println("couponPriceCalculation.priceCalculation");

        pdc.discountCalCoupon("product");
        sdc.discountCalCoupon("overlap");
        tdc.discountCalCoupon("basket");
        tdc.discountCalCoupon("pricing");

        return null;
    }
}
