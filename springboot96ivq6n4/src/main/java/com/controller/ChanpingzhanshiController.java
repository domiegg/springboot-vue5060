package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChanpingzhanshiEntity;
import com.entity.view.ChanpingzhanshiView;

import com.service.ChanpingzhanshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 产品展示
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
@RestController
@RequestMapping("/chanpingzhanshi")
public class ChanpingzhanshiController {
    @Autowired
    private ChanpingzhanshiService chanpingzhanshiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChanpingzhanshiEntity chanpingzhanshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chanpingzhanshi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChanpingzhanshiEntity> ew = new EntityWrapper<ChanpingzhanshiEntity>();

		PageUtils page = chanpingzhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpingzhanshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChanpingzhanshiEntity chanpingzhanshi, 
		HttpServletRequest request){
        EntityWrapper<ChanpingzhanshiEntity> ew = new EntityWrapper<ChanpingzhanshiEntity>();

		PageUtils page = chanpingzhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chanpingzhanshi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChanpingzhanshiEntity chanpingzhanshi){
       	EntityWrapper<ChanpingzhanshiEntity> ew = new EntityWrapper<ChanpingzhanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chanpingzhanshi, "chanpingzhanshi")); 
        return R.ok().put("data", chanpingzhanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChanpingzhanshiEntity chanpingzhanshi){
        EntityWrapper< ChanpingzhanshiEntity> ew = new EntityWrapper< ChanpingzhanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chanpingzhanshi, "chanpingzhanshi")); 
		ChanpingzhanshiView chanpingzhanshiView =  chanpingzhanshiService.selectView(ew);
		return R.ok("查询产品展示成功").put("data", chanpingzhanshiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChanpingzhanshiEntity chanpingzhanshi = chanpingzhanshiService.selectById(id);
        return R.ok().put("data", chanpingzhanshi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChanpingzhanshiEntity chanpingzhanshi = chanpingzhanshiService.selectById(id);
        return R.ok().put("data", chanpingzhanshi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChanpingzhanshiEntity chanpingzhanshi = chanpingzhanshiService.selectById(id);
        if(type.equals("1")) {
        	chanpingzhanshi.setThumbsupnum(chanpingzhanshi.getThumbsupnum()+1);
        } else {
        	chanpingzhanshi.setCrazilynum(chanpingzhanshi.getCrazilynum()+1);
        }
        chanpingzhanshiService.updateById(chanpingzhanshi);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChanpingzhanshiEntity chanpingzhanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chanpingzhanshi);
        chanpingzhanshiService.insert(chanpingzhanshi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChanpingzhanshiEntity chanpingzhanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chanpingzhanshi);
        chanpingzhanshiService.insert(chanpingzhanshi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChanpingzhanshiEntity chanpingzhanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chanpingzhanshi);
        chanpingzhanshiService.updateById(chanpingzhanshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chanpingzhanshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
