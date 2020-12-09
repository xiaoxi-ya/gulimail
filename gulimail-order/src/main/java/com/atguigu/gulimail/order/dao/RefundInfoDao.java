package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-03 17:32:24
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
