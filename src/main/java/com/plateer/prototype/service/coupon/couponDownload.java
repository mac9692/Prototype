package com.plateer.prototype.service.coupon;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class couponDownload {

    private final downPossibleCoupon dpc;

    public List couponDownload() {
        System.out.println("===쿠폰 다운로드 시작===");
        System.out.println("couponDownload.couponDownload");
        dpc.getDownPossibleCoupon();
        System.out.println("오프라인 쿠폰 확인");
        System.out.println("인증코드 등록");
        System.out.println("인증코드 일치 확인");
        System.out.println("다운로드 가능 여부 확인");
        System.out.println("쿠폰 발급");
        System.out.println("===쿠폰 다운로드 종료===");

        return null;
    }
}
