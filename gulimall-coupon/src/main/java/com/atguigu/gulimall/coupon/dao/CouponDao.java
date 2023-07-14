package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:37:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
