package com.dao;

import com.entity.ChanpingleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpingleibieVO;
import com.entity.view.ChanpingleibieView;


/**
 * 产品类别
 * 
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface ChanpingleibieDao extends BaseMapper<ChanpingleibieEntity> {
	
	List<ChanpingleibieVO> selectListVO(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);
	
	ChanpingleibieVO selectVO(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);
	
	List<ChanpingleibieView> selectListView(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);

	List<ChanpingleibieView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);

	
	ChanpingleibieView selectView(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);
	

}
