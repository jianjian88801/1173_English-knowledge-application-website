package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexijiqiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexijiqiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexijiqiaoView;


/**
 * 学习技巧评论表
 *
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
public interface DiscussxuexijiqiaoService extends IService<DiscussxuexijiqiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexijiqiaoVO> selectListVO(Wrapper<DiscussxuexijiqiaoEntity> wrapper);
   	
   	DiscussxuexijiqiaoVO selectVO(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
   	
   	List<DiscussxuexijiqiaoView> selectListView(Wrapper<DiscussxuexijiqiaoEntity> wrapper);
   	
   	DiscussxuexijiqiaoView selectView(@Param("ew") Wrapper<DiscussxuexijiqiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexijiqiaoEntity> wrapper);
   	
}

