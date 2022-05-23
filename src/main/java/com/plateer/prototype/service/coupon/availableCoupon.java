package com.plateer.prototype.service.coupon;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class availableCoupon {
    public List<String> getAvailableCoupon() {
        System.out.println("===사용 가능 쿠폰 조회 시작===");
        System.out.println("availableCoupon.getAvailableCoupon");

        List arr = new ArrayList();
        arr.add("즉석쿠폰");
        arr.add("이벤트쿠폰");
        arr.add("중복쿠폰");
        arr.add("배송비쿠폰");
        System.out.println("사용가능 쿠폰 : "+arr);
        System.out.println("===사용 가능 쿠폰 조회 종===");

        return null;
    }
}
