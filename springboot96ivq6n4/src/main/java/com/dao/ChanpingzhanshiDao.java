package com.dao;

import com.entity.ChanpingzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpingzhanshiVO;
import com.entity.view.ChanpingzhanshiView;


/**
 * 产品展示
 * 
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface ChanpingzhanshiDao extends BaseMapper<ChanpingzhanshiEntity> {
	
	List<ChanpingzhanshiVO> selectListVO(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);
	
	ChanpingzhanshiVO selectVO(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);
	
	List<ChanpingzhanshiView> selectListView(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);

	List<ChanpingzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);

	
	ChanpingzhanshiView selectView(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);
	

}
