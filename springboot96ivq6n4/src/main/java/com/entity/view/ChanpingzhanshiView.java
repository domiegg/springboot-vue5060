package com.entity.view;

import com.entity.ChanpingzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 产品展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
@TableName("chanpingzhanshi")
public class ChanpingzhanshiView  extends ChanpingzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpingzhanshiView(){
	}
 
 	public ChanpingzhanshiView(ChanpingzhanshiEntity chanpingzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, chanpingzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
