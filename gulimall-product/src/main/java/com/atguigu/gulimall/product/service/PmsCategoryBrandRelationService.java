package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsCategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌与分类关联
 *
 * @author zhouzhao
 * @email v3117918124@gmail.com
 * @date 2023-07-14 12:23:21
 */
public interface PmsCategoryBrandRelationService extends IService<PmsCategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

