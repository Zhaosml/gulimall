package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员等级
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 14:53:32
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 级别名称
	 */
	private String name;
	/**
	 * 级别需要的成长值
	 */
	private Integer growthPoint;
	/**
	 * 是否为默认级别[0->否，1->是]
	 */
	private Integer defaultStatus;
	/**
	 * 免运费标准
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * 每次评价获取的成长值
	 */
	private Integer commentGrowthPoint;
	/**
	 * 是否有免邮特权
	 */
	private Integer privilegeFreeFreight;
	/**
	 * 是否有会员价格特权
	 */
	private Integer privilegeMemberPrice;
	/**
	 * 是否有生日特权
	 */
	private Integer privilegeBirthday;
	/**
	 * 备注
	 */
	private String note;

}
