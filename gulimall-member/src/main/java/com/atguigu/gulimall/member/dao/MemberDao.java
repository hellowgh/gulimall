package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leifeiyang
 * @email wgh@gmail.com
 * @date 2022-09-12 17:40:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
