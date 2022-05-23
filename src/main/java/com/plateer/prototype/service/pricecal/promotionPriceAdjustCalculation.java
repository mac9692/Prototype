package com.plateer.prototype.service.pricecal;

import org.springframework.stereotype.Service;

@Service
public class promotionPriceAdjustCalculation {

    public Long priceCalculation() {
        System.out.println("===가격조정금액계산===");
        System.out.println("promotionPriceAdjustCalculation.priceCalculation");
        System.out.println("행사가 적용되었는지 확인");
        System.out.println("할인금액이 최대할인금액보다 큰지 확인");
        System.out.println("할인금액 전달");
        System.out.println("===가격조정금액계산 종료===");

        return null;
    }
}
