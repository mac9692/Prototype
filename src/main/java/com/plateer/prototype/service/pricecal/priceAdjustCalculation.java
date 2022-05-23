package com.plateer.prototype.service.pricecal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class priceAdjustCalculation {
    private final promotionPriceAdjustCalculation ppac;

    public Object priceCalculation() {
        System.out.println("===가격조정금액계산 시작===");
        System.out.println("priceAdjustCalculation.priceCalculation");
        ppac.priceCalculation();

        return null;
    }
}
