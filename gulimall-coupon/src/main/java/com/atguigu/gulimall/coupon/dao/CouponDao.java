package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leifeiyang
 * @email wgh@gmail.com
 * @date 2022-09-12 17:28:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
