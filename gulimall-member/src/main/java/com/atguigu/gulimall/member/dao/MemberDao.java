package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 14:53:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
