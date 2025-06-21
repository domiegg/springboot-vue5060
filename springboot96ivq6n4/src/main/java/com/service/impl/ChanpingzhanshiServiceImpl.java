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


import com.dao.ChanpingzhanshiDao;
import com.entity.ChanpingzhanshiEntity;
import com.service.ChanpingzhanshiService;
import com.entity.vo.ChanpingzhanshiVO;
import com.entity.view.ChanpingzhanshiView;

@Service("chanpingzhanshiService")
public class ChanpingzhanshiServiceImpl extends ServiceImpl<ChanpingzhanshiDao, ChanpingzhanshiEntity> implements ChanpingzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpingzhanshiEntity> page = this.selectPage(
                new Query<ChanpingzhanshiEntity>(params).getPage(),
                new EntityWrapper<ChanpingzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpingzhanshiEntity> wrapper) {
		  Page<ChanpingzhanshiView> page =new Query<ChanpingzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChanpingzhanshiVO> selectListVO(Wrapper<ChanpingzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpingzhanshiVO selectVO(Wrapper<ChanpingzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpingzhanshiView> selectListView(Wrapper<ChanpingzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpingzhanshiView selectView(Wrapper<ChanpingzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
