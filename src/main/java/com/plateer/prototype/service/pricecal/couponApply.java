package com.plateer.prototype.service.pricecal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class couponApply {

    private final priceCalculation pc;

    public Object getCouponApply() {
        System.out.println("===적용가능쿠폰 조회 시작===");
        System.out.println("couponApply.getCouponApply");
        getCouponData();
        chkCouponInfo();
        pc.priceCalculation("cpc");
        System.out.println("계산값 전달");
        System.out.println("===적용가능쿠폰 조회 종료===");

        return null;
    }

    private Object getCouponData() {
        System.out.println("===프로모션 적용 데이터 요청===");
        System.out.println("couponApply.getCouponData");
        System.out.println("===프로모션 적용 데이터 요청 종료===");

        return null;
    }

    private Boolean chkCouponInfo() {
        System.out.println("===쿠폰 적용 대상 판별===");
        System.out.println("couponApply.chkCouponInfo");
        System.out.println("쿠폰 적용 대상 여부 확인");
        System.out.println("매체 구분 일치 확인");
        System.out.println("채널 일치 여부 확인");
        System.out.println("혜택 구분 확인");

        return null;
    }
}
