package com.dao;

import com.entity.DiscusschanpingzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpingzhanshiVO;
import com.entity.view.DiscusschanpingzhanshiView;


/**
 * 产品展示评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface DiscusschanpingzhanshiDao extends BaseMapper<DiscusschanpingzhanshiEntity> {
	
	List<DiscusschanpingzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);
	
	DiscusschanpingzhanshiVO selectVO(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);
	
	List<DiscusschanpingzhanshiView> selectListView(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);

	List<DiscusschanpingzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);

	
	DiscusschanpingzhanshiView selectView(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);
	

}
