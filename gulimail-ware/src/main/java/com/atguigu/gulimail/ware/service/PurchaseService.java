package com.atguigu.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimail.common.utils.PageUtils;
import com.atguigu.gulimail.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-04 08:48:06
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

