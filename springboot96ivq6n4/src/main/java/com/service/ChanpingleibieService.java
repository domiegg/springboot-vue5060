package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpingleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpingleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpingleibieView;


/**
 * 产品类别
 *
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface ChanpingleibieService extends IService<ChanpingleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpingleibieVO> selectListVO(Wrapper<ChanpingleibieEntity> wrapper);
   	
   	ChanpingleibieVO selectVO(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);
   	
   	List<ChanpingleibieView> selectListView(Wrapper<ChanpingleibieEntity> wrapper);
   	
   	ChanpingleibieView selectView(@Param("ew") Wrapper<ChanpingleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpingleibieEntity> wrapper);

   	

}

