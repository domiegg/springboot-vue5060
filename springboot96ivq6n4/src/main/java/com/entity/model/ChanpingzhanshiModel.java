package com.entity.model;

import com.entity.ChanpingzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 产品展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-21 14:06:52
 */
public class ChanpingzhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 产品标题
	 */
	
	private String tiezibiaoti;
		
	/**
	 * 产品类别
	 */
	
	private String chanpingleibie;
		
	/**
	 * 产品封面
	 */
	
	private String tiezifengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 产品文案
	 */
	
	private String tieziwenan;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：产品标题
	 */
	 
	public void setTiezibiaoti(String tiezibiaoti) {
		this.tiezibiaoti = tiezibiaoti;
	}
	
	/**
	 * 获取：产品标题
	 */
	public String getTiezibiaoti() {
		return tiezibiaoti;
	}
				
	
	/**
	 * 设置：产品类别
	 */
	 
	public void setChanpingleibie(String chanpingleibie) {
		this.chanpingleibie = chanpingleibie;
	}
	
	/**
	 * 获取：产品类别
	 */
	public String getChanpingleibie() {
		return chanpingleibie;
	}
				
	
	/**
	 * 设置：产品封面
	 */
	 
	public void setTiezifengmian(String tiezifengmian) {
		this.tiezifengmian = tiezifengmian;
	}
	
	/**
	 * 获取：产品封面
	 */
	public String getTiezifengmian() {
		return tiezifengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：产品文案
	 */
	 
	public void setTieziwenan(String tieziwenan) {
		this.tieziwenan = tieziwenan;
	}
	
	/**
	 * 获取：产品文案
	 */
	public String getTieziwenan() {
		return tieziwenan;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
