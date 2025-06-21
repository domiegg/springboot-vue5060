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


import com.dao.ChanpingleibieDao;
import com.entity.ChanpingleibieEntity;
import com.service.ChanpingleibieService;
import com.entity.vo.ChanpingleibieVO;
import com.entity.view.ChanpingleibieView;

@Service("chanpingleibieService")
public class ChanpingleibieServiceImpl extends ServiceImpl<ChanpingleibieDao, ChanpingleibieEntity> implements ChanpingleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpingleibieEntity> page = this.selectPage(
                new Query<ChanpingleibieEntity>(params).getPage(),
                new EntityWrapper<ChanpingleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpingleibieEntity> wrapper) {
		  Page<ChanpingleibieView> page =new Query<ChanpingleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChanpingleibieVO> selectListVO(Wrapper<ChanpingleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpingleibieVO selectVO(Wrapper<ChanpingleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpingleibieView> selectListView(Wrapper<ChanpingleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpingleibieView selectView(Wrapper<ChanpingleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
