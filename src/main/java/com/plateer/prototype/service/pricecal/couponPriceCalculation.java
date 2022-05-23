package com.plateer.prototype.service.pricecal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class couponPriceCalculation {
    private final normalCouponPriceCalculation ncpc;
    private final cartCouponPriceCalculation ccpc;

    public List priceCalculation() {
        System.out.println("===쿠폰할인계산 시작===");
        System.out.println("couponPriceCalculation.priceCalculation");

        ncpc.priceCalculation();
        ccpc.priceCalculation();

        return null;
    }
}
