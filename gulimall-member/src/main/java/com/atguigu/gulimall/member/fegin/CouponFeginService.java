package com.atguigu.gulimall.member.fegin;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author 钊思暮想
 * @date 2023/7/14 17:05
 */
@FeignClient("gulimall-coupon")
public interface CouponFeginService {
    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
