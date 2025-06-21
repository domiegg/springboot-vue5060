package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschanpingzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschanpingzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschanpingzhanshiView;


/**
 * 产品展示评论表
 *
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public interface DiscusschanpingzhanshiService extends IService<DiscusschanpingzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschanpingzhanshiVO> selectListVO(Wrapper<DiscusschanpingzhanshiEntity> wrapper);
   	
   	DiscusschanpingzhanshiVO selectVO(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);
   	
   	List<DiscusschanpingzhanshiView> selectListView(Wrapper<DiscusschanpingzhanshiEntity> wrapper);
   	
   	DiscusschanpingzhanshiView selectView(@Param("ew") Wrapper<DiscusschanpingzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschanpingzhanshiEntity> wrapper);

   	

}

