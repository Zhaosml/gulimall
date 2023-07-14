package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品属性
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 12:23:21
 */
@Data
@TableName("pms_attr")
public class PmsAttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 属性id
	 */
	@TableId
	private Long attrId;
	/**
	 * 属性名称
	 */
	private String attrName;
	/**
	 * 是否需要检索[0-不需要，1-需要]
	 */
	private Integer searchType;
	/**
	 * 属性图标
	 */
	private String icon;
	/**
	 * 可选值列表[用逗号分隔]
	 */
	private String valueSelect;
	/**
	 * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
	 */
	private Integer attrType;
	/**
	 * 属性状态[0 - 禁用，1 - 启用]
	 */
	private Integer enable;
	/**
	 * 所属分类
	 */
	private Long catelogId;
	/**
	 * 显示描述是否显示在sku上[0-不显示，1-显示]
	 */
	private Integer showDesc;

}
