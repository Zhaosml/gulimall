package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单相关设置
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 14:36:31
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 秒杀订单超时关闭时间(分)
	 */
	private Integer flashOrderOvertime;
	/**
	 * 正常订单超时时间(分)
	 */
	private Integer normalOrderOvertime;
	/**
	 * 自动确认收货时间（天）
	 */
	private Integer confirmOvertime;
	/**
	 * 自动完成交易时间，不能申请售后（天）
	 */
	private Integer finishOvertime;
	/**
	 * 自动好评时间（天）
	 */
	private Integer commentOvertime;
	/**
	 * 会员等级【0->不限会员等级，全部通用；其他-对应等级，可以分别设置】
	 */
	private Integer memberLevel;

}
