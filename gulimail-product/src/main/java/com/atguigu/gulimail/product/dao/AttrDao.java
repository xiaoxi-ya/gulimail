package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-03 14:36:38
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
