package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexijiqiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexijiqiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexijiqiaoView;


/**
 * 学习技巧
 *
 * @author 
 * @email 
 * @date 2021-05-26 13:14:44
 */
public interface XuexijiqiaoService extends IService<XuexijiqiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexijiqiaoVO> selectListVO(Wrapper<XuexijiqiaoEntity> wrapper);
   	
   	XuexijiqiaoVO selectVO(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
   	
   	List<XuexijiqiaoView> selectListView(Wrapper<XuexijiqiaoEntity> wrapper);
   	
   	XuexijiqiaoView selectView(@Param("ew") Wrapper<XuexijiqiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexijiqiaoEntity> wrapper);
   	
}

