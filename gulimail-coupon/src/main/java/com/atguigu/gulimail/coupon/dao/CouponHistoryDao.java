package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-03 15:37:26
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
