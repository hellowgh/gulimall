package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leifeiyang
 * @email wgh@gmail.com
 * @date 2022-09-12 10:34:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
