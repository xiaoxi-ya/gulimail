package com.atguigu.gulimail.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.atguigu.gulimail.coupon.service.CouponService;
import com.atguigu.gulimail.common.utils.PageUtils;
import com.atguigu.gulimail.common.utils.R;



/**
 * 优惠券信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-03 15:37:26
 */
@RestController
@RequestMapping("coupon/coupon")
@RefreshScope
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.username}")
    private  String username;
    @Value("${coupon.user.age}")
    private  String age;
    @GetMapping("/test")
    public R  test(){
        return R.ok().put("username",username).put("age",age);
    }@GetMapping("/coupons")
    public R  queryAll(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减50");
        return R.ok().put("coupon", couponEntity);
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
