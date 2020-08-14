package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fengchen
 * @email ${email}
 * @date 2020-08-12 17:57:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
