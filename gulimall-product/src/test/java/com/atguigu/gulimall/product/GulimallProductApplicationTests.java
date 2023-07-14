package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GulimallProductApplicationTests {
	@Autowired
	BrandService brandService;
	@Test
	public void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		//brandEntity.setName("华为");
		//brandService.save(brandEntity);

		//brandEntity.setBrandId(1L);
		//brandEntity.setDescript("华为");
		//brandService.updateById(brandEntity);
		//System.out.println("保存成功。。。。");

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach((item)->{
			System.out.println(item);
		});
	}

}
