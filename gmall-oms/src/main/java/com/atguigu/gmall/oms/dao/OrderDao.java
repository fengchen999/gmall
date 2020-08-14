package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fengchen
 * @email ${email}
 * @date 2020-08-13 16:38:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
