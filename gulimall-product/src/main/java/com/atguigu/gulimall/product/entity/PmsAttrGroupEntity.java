package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性分组
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 12:23:21
 */
@Data
@TableName("pms_attr_group")
public class PmsAttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 属性分组id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 属性分组名称
	 */
	private String attrGroupName;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 描述
	 */
	private String descript;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 所属分类id
	 */
	private Long catelogId;

}
