package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券信息
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:37:24
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 优惠券id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠券类型[0->全场券；1->会员券；2->品类券；3->SPU券]
	 */
	private Integer couponType;
	/**
	 * 优惠券图片
	 */
	private String couponImg;
	/**
	 * 优惠券名称
	 */
	private String couponName;
	/**
	 * 数量
	 */
	private Integer num;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 每人限领
	 */
	private Integer perLimit;
	/**
	 * 使用门槛
	 */
	private BigDecimal minPoint;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	private Integer useType;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 领取数量
	 */
	private Integer publishCount;
	/**
	 * 使用数量
	 */
	private Integer useCount;
	/**
	 * 领取数量
	 */
	private Integer receiveCount;
	/**
	 * 可以领取的开始日期
	 */
	private Date enableStartTime;
	/**
	 * 可以领取的结束日期
	 */
	private Date enableEndTime;
	/**
	 * 优惠码
	 */
	private String code;
	/**
	 * 会员领取的最高等级[0->不限等级，其他-对应等级]
	 */
	private Integer memberLevel;
	/**
	 * 发布状态[0-未发布，1-已发布]
	 */
	private Integer publish;

}
