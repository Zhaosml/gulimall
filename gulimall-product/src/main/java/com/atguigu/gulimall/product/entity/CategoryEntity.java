package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品分类
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:38:53
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	private Long catId;
	/**
	 * 分类名称
	 */
	private String name;
	/**
	 * 父分类id
	 */
	private Long parentCid;
	/**
	 * 层级
	 */
	private Integer catLevel;
	/**
	 * 是否显示[0-不显示，1-显示]
	 */
	private Integer showStatus;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 商品单位
	 */
	private String productUnit;
	/**
	 * 商品数量
	 */
	private Integer productCount;

}
