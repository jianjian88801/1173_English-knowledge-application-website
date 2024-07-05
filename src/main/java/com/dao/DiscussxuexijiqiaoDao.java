package com.dao;

import com.entity.DiscussxuexijiqiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexijiqiaoVO;
import com.entity.view.DiscussxuexijiqiaoView;


/**
 * 学习技巧评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
public interface DiscussxuexijiqiaoDao extends BaseMapper<DiscussxuexijiqiaoEntity> {
	
	List<DiscussxuexijiqiaoVO> selectListVO(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
	
	DiscussxuexijiqiaoVO selectVO(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
	
	List<DiscussxuexijiqiaoView> selectListView(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);

	List<DiscussxuexijiqiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
	
	DiscussxuexijiqiaoView selectView(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
	
}
