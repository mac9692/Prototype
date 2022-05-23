package com.plateer.prototype.service.couponset;

public abstract class AbstractCoupon {
    Integer rank;
    String name;
    Integer price;

    public void validation() {
        System.out.println("쿠폰 할인 검증 프로세스");
    }
    public void discount() {
        System.out.println(name + " 할인 쿠폰 적용 시작");
        System.out.println(rank + " 차 할인 쿠폰 (" + name + ") " + price + "원 할인 적용");
    }
}
