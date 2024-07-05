package com.dao;

import com.entity.XuexijiqiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexijiqiaoVO;
import com.entity.view.XuexijiqiaoView;


/**
 * 学习技巧
 * 
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
public interface XuexijiqiaoDao extends BaseMapper<XuexijiqiaoEntity> {
	
	List<XuexijiqiaoVO> selectListVO(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
	
	XuexijiqiaoVO selectVO(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
	
	List<XuexijiqiaoView> selectListView(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);

	List<XuexijiqiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
	
	XuexijiqiaoView selectView(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
	
}
