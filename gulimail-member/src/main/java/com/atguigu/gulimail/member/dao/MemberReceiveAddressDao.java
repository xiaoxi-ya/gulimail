package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-04 08:45:02
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {
	
}
