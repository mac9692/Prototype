package com.plateer.prototype.service;

import com.plateer.prototype.mapper.UserMapper;
import com.plateer.prototype.service.coupon.availableCoupon;
import com.plateer.prototype.service.coupon.couponCancle;
import com.plateer.prototype.service.coupon.couponUse;
import com.plateer.prototype.vo.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<Users> getUserList() {
        System.out.println("유저리스트반환");
        availableCoupon availableCoupon = new availableCoupon();
        couponUse couponUse = new couponUse();
        couponCancle couponCancle = new couponCancle();

        availableCoupon.getAvailableCoupon();
        couponUse.useCoupon();
        couponCancle.cancleCoupon();

        return userMapper.getUserList();
    }

    @Override
    public Integer countUsers() {
        System.out.println("유저 수 반환");

        return userMapper.countUsers();
    }
}
