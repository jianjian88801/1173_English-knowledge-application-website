package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 培训信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
@TableName("peixunxinxi")
public class PeixunxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeixunxinxiEntity() {
		
	}
	
	public PeixunxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 培训名称
	 */
					
	private String peixunmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：培训名称
	 */
	public void setPeixunmingcheng(String peixunmingcheng) {
		this.peixunmingcheng = peixunmingcheng;
	}
	/**
	 * 获取：培训名称
	 */
	public String getPeixunmingcheng() {
		return peixunmingcheng;
	}
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
