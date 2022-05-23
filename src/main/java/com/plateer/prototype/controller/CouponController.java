package com.plateer.prototype.controller;

import com.plateer.prototype.service.coupon.availableCoupon;
import com.plateer.prototype.service.coupon.couponCancle;
import com.plateer.prototype.service.coupon.couponDownload;
import com.plateer.prototype.service.coupon.couponUse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/coupon")
@RequiredArgsConstructor
public class CouponController {

    private final couponDownload couponDownload;
    private final couponCancle couponCancle;
    private final couponUse couponUse;
    private final availableCoupon availableCoupon;

    @RequestMapping("download")
    public String downloadCoupon() {
        couponDownload.couponDownload();
        return null;
    };

    @RequestMapping("cancle")
    public String cancleCoupon() {
        couponCancle.cancleCoupon();
        return null;
    }

    @RequestMapping("use")
    public String useCoupon() {
        couponUse.useCoupon();
        return null;
    }

    @RequestMapping("available")
    public String availableCoupon() {
        availableCoupon.getAvailableCoupon();
        return null;
    }
}
