package com.plateer.prototype.service.pricecal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class priceAdjustApply {
    private final priceCalculation pc;

    public Object getPriceAdjust() {
        System.out.println("===가격조정적용===");
        System.out.println("priceAdjustApply.getPriceAdjust");
        getPromotionData();
        chkPromotionInfo();
        pc.priceCalculation("pac");
        System.out.println("계산값 전달");
        System.out.println("===가격조정적용 종료===");

        return null;
    }

    private Object getPromotionData() {
        System.out.println("===프로모션 적용 데이터 요청===");
        System.out.println("priceAdjustApply.getPromotionData");
        System.out.println("===프로모션 적용 데이터 요청 종료===");

        return null;
    }

    private Boolean chkPromotionInfo() {
        System.out.println("===프로모션 적용 대상 판별===");
        System.out.println("priceAdjustApply.chkPromotionInfo");
        System.out.println("적용 대상 프로모션 확인");
        System.out.println("적용 가능 회원 여부 확인");
        System.out.println("최소 금액 충족 여부 확인");
        System.out.println("===프로모션 적용 대상 판별 종료===");

        return null;
    }
}
