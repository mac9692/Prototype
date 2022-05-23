package com.plateer.prototype.controller;

import com.plateer.prototype.service.pricecal.couponApply;
import com.plateer.prototype.service.pricecal.couponApplyTest;
import com.plateer.prototype.service.pricecal.priceAdjustApply;
import com.plateer.prototype.service.pricecal.promotionCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/priceCal")
@RequiredArgsConstructor
public class PriceCalController {

    private final priceAdjustApply priceAdjustApply;
    private final couponApply couponApply;
    private final couponApplyTest couponApplyTest;
    private final promotionCheck promotionCheck;

    @RequestMapping("adjustApplyPrice")
    public String adjustApplyPrice() {
        priceAdjustApply.getPriceAdjust();
        return null;
    }

    @RequestMapping("applyCoupon")
    public String applyCoupon() {
        couponApply.getCouponApply();
        return null;
    }

    @RequestMapping("applyCouponAbstract")
    public String applyCouponAbs() {
        couponApplyTest.getCouponApply();
        return null;
    }

    @RequestMapping("promotionCheck")
    public String promotionCheck() {
        promotionCheck.chkPromotionData();
        return null;
    }
}
