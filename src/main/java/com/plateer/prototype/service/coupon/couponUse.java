package com.plateer.prototype.service.coupon;

import org.springframework.stereotype.Service;

@Service
public class couponUse {
    public Long useCoupon() {
        System.out.println("===쿠폰 사용 시작===");
        System.out.println("couponUse.useCoupon");
        System.out.println("쿠폰사용일시 처리");
        System.out.println("===쿠폰 사용 종료===");

        return null;
    };
}
