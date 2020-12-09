package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimail.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-03 14:53:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

