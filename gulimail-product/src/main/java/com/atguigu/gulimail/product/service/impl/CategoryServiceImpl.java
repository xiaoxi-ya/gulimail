package com.atguigu.gulimail.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimail.common.utils.PageUtils;
import com.atguigu.gulimail.common.utils.Query;

import com.atguigu.gulimail.product.dao.CategoryDao;
import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.atguigu.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //进行数据分类
        List<CategoryEntity> collect = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek(menu -> menu.setCategoryEntities(categoryEntityList(menu, categoryEntities)))
                .sorted((categoryEntities1, categoryEntities2) -> {
                    return  (categoryEntities1.getSort() == null ? 0 : categoryEntities1.getSort()) - (categoryEntities2.getSort() == null ? 0 : categoryEntities2.getSort());
                })
                .collect(Collectors.toList());
        return collect;
    }

    public List<CategoryEntity> categoryEntityList(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> entityList = categoryEntityList.stream().filter(category -> {
            return category.getParentCid().equals(categoryEntity.getCatId());
        }).peek(category -> category.setCategoryEntities(categoryEntityList(category, categoryEntityList))).sorted((categoryEntity1, categoryEntity2) -> {
            return (categoryEntity1.getSort() == null ? 0 : categoryEntity1.getSort()) - (categoryEntity2.getSort() == null ? 0 : categoryEntity2.getSort());
        }).collect(Collectors.toList());
        return entityList;
    }

}