package com.plateer.prototype.service.coupon;

import org.springframework.stereotype.Service;

@Service
public class couponCancle {
    public Long cancleCoupon() {
        System.out.println("===쿠폰 취소 시작===");
        System.out.println("couponCancle.cancleCoupon");
        System.out.println("프로모션 기간이 지났는지 확인");
        restoreCoupon();
        System.out.println("===쿠폰 취소 종료===");

        return null;
    }

    private Long restoreCoupon() {
        System.out.println("===쿠폰 복원 시작===");
        System.out.println("couponCancle.restoreCoupon");
        System.out.println("신규쿠폰 발급");
        System.out.println("데이터 생성");
        System.out.println("원쿠폰발급번호 등록");
        System.out.println("===쿠폰 복원 종료===");

        return null;
    }
}
