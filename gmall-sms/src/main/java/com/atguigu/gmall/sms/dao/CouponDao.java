package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fengchen
 * @email ${email}
 * @date 2020-08-13 16:02:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
