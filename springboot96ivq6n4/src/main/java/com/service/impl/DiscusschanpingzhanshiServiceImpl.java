package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschanpingzhanshiDao;
import com.entity.DiscusschanpingzhanshiEntity;
import com.service.DiscusschanpingzhanshiService;
import com.entity.vo.DiscusschanpingzhanshiVO;
import com.entity.view.DiscusschanpingzhanshiView;

@Service("discusschanpingzhanshiService")
public class DiscusschanpingzhanshiServiceImpl extends ServiceImpl<DiscusschanpingzhanshiDao, DiscusschanpingzhanshiEntity> implements DiscusschanpingzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschanpingzhanshiEntity> page = this.selectPage(
                new Query<DiscusschanpingzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscusschanpingzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschanpingzhanshiEntity> wrapper) {
		  Page<DiscusschanpingzhanshiView> page =new Query<DiscusschanpingzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschanpingzhanshiVO> selectListVO(Wrapper<DiscusschanpingzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschanpingzhanshiVO selectVO(Wrapper<DiscusschanpingzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschanpingzhanshiView> selectListView(Wrapper<DiscusschanpingzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschanpingzhanshiView selectView(Wrapper<DiscusschanpingzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
