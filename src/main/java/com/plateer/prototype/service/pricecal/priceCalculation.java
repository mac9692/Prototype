package com.plateer.prototype.service.pricecal;

import com.plateer.prototype.service.couponcalculator.AbstractCouponCalculator;
import com.plateer.prototype.service.couponcalculator.PrimaryDiscountCoupon;
import com.plateer.prototype.service.couponcalculator.SecondaryDiscountCoupon;
import com.plateer.prototype.service.couponcalculator.TertiaryDiscountCoupon;
import com.plateer.prototype.service.couponset.AbstractCoupon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class priceCalculation {
    private final priceAdjustCalculation pac;
    private final couponPriceCalculation cpc;
    private final PrimaryDiscountCoupon pdc;
    private final SecondaryDiscountCoupon sdc;
    private final TertiaryDiscountCoupon tdc;

    public Object priceCalculation(String id) {
        System.out.println("===가격 계산===");
        System.out.println("priceCalculation.priceCalculation");

        if (id.equals("pac")) {
            pac.priceCalculation();
        } else if (id.equals("cpc")) {
            cpc.priceCalculation();
        } else if (id.equals("validation")) {
            System.out.println("프로모션 적용금액 계산");
            System.out.println("할인금액 값 전달");
            System.out.println("할인 금액 검증(주문 모듈 호출)");
        } else if (id.equals("cpcFactory")) {
            pdc.discountCalCoupon("product");
            sdc.discountCoupon("overlap");
            tdc.discountCalCoupon("basket");
            tdc.discountCalCoupon("pricing");
        } else {
            return null;
        }
        return null;
    }
}

enum DiscountType {
    PAC,
    CPC,
    VALIDATION,
    CPCFACTORY
}
