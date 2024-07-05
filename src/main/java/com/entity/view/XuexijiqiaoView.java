package com.entity.view;

import com.entity.XuexijiqiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习技巧
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
@TableName("xuexijiqiao")
public class XuexijiqiaoView  extends XuexijiqiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexijiqiaoView(){
	}
 
 	public XuexijiqiaoView(XuexijiqiaoEntity xuexijiqiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xuexijiqiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
