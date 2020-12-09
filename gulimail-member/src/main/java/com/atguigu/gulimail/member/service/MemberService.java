package com.atguigu.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimail.common.utils.PageUtils;
import com.atguigu.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-04 08:45:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

