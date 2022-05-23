package com.plateer.prototype.service.pricecal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class promotionCheck {
    private final priceCalculation pc;

    public Boolean chkPromotionData() {
        System.out.println("===프로모션 유효성 검증 시작===");
        System.out.println("promotionCheck.chkPromotionData");
        pc.priceCalculation("validation");
        System.out.println("===프로모션 유효성 검증 종료===");

        return null;
    }
}
