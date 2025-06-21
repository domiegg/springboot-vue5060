package com.entity.view;

import com.entity.ChanpingleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 产品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
@TableName("chanpingleibie")
public class ChanpingleibieView  extends ChanpingleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpingleibieView(){
	}
 
 	public ChanpingleibieView(ChanpingleibieEntity chanpingleibieEntity){
 	try {
			BeanUtils.copyProperties(this, chanpingleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
