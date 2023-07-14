package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 13:38:53
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名称
	 */
	private String name;
	/**
	 * 品牌logo地址
	 */
	private String logo;
	/**
	 * 描述
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示，1-显示]
	 */
	private Integer showStatus;
	/**
	 * 首字母
	 */
	private String firstLetter;
	/**
	 * 排序
	 */
	private Integer sort;

}
