package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品spu积分设置
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:37:24
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long spuId;
	/**
	 * 成长积分
	 */
	private BigDecimal growBounds;
	/**
	 * 购物积分
	 */
	private BigDecimal buyBounds;
	/**
	 * 优惠券工作状态[1111四个状态位，从右到左分别表示：积分规则是否开启；0 - 未使用积分相关功能；1 - 使用成长积分功能；2 - 使用购物积分功能；3 - 使用成长积分和购物积分功能；状态位0表示未开启，1表示开启]
	 */
	private Integer work;

}
