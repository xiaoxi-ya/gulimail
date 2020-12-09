package com.atguigu.gulimail.member.feign;

import com.atguigu.gulimail.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/coupons")
    public R queryAll();
}
