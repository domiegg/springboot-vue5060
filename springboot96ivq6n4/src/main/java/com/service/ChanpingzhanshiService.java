package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpingzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpingzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpingzhanshiView;


/**
 * 产品展示
 *
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface ChanpingzhanshiService extends IService<ChanpingzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpingzhanshiVO> selectListVO(Wrapper<ChanpingzhanshiEntity> wrapper);
   	
   	ChanpingzhanshiVO selectVO(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);
   	
   	List<ChanpingzhanshiView> selectListView(Wrapper<ChanpingzhanshiEntity> wrapper);
   	
   	ChanpingzhanshiView selectView(@Param("ew") Wrapper<ChanpingzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpingzhanshiEntity> wrapper);

   	

}

