package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品阶梯价格
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:37:24
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 满足的商品数量
	 */
	private Integer fullCount;
	/**
	 * 折扣
	 */
	private BigDecimal discount;
	/**
	 * 打折后的价格
	 */
	private BigDecimal price;
	/**
	 * 是否叠加其他优惠[0->不可叠加；1->可叠加]
	 */
	private Integer addOther;

}
