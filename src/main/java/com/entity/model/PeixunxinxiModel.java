package com.entity.model;

import com.entity.PeixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 培训信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
public class PeixunxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程
	 */
	
	private String kecheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 培训周期
	 */
	
	private String peixunzhouqi;
		
	/**
	 * 培训费用
	 */
	
	private Integer peixunfeiyong;
		
	/**
	 * 培训地点
	 */
	
	private String peixundidian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：课程
	 */
	 
	public void setKecheng(String kecheng) {
		this.kecheng = kecheng;
	}
	
	/**
	 * 获取：课程
	 */
	public String getKecheng() {
		return kecheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：培训周期
	 */
	 
	public void setPeixunzhouqi(String peixunzhouqi) {
		this.peixunzhouqi = peixunzhouqi;
	}
	
	/**
	 * 获取：培训周期
	 */
	public String getPeixunzhouqi() {
		return peixunzhouqi;
	}
				
	
	/**
	 * 设置：培训费用
	 */
	 
	public void setPeixunfeiyong(Integer peixunfeiyong) {
		this.peixunfeiyong = peixunfeiyong;
	}
	
	/**
	 * 获取：培训费用
	 */
	public Integer getPeixunfeiyong() {
		return peixunfeiyong;
	}
				
	
	/**
	 * 设置：培训地点
	 */
	 
	public void setPeixundidian(String peixundidian) {
		this.peixundidian = peixundidian;
	}
	
	/**
	 * 获取：培训地点
	 */
	public String getPeixundidian() {
		return peixundidian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
