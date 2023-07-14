package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成长值变化历史记录
 * 
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 14:53:32
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 变化值，正数为增加，负数为减少
	 */
	private Integer changeCount;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 变化来源[0-系统，1-管理员修改]
	 */
	private Integer sourceType;

}
