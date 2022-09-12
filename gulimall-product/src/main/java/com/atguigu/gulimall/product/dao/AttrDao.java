package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author leifeiyang
 * @email wgh@gmail.com
 * @date 2022-09-12 10:34:13
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
